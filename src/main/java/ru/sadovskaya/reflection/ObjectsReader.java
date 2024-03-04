package ru.sadovskaya.reflection;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ObjectsReader<T> {
    String fileName;

    public ObjectsReader(String fileName) {
        this.fileName = fileName;
    }

    public List<T> read() {
        List<T> res = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                String[] objStr = s.split(" ");
                if (objStr[0].equals("class")) {
                    Class<T> clz = (Class<T>) Class.forName(objStr[1]);
                    List<String> tmp = new ArrayList<>(Arrays.asList(objStr).subList(2, objStr.length));
                    String[] params = tmp.toArray(new String[0]);
                    Constructor[] constructors = clz.getDeclaredConstructors();
                    for (Constructor constructor : constructors) {
                        constructor.setAccessible(true);
                        Object object = constructor.newInstance(params);
                        res.add((T) object);
                    }
                }
            }
        } catch (FileNotFoundException | ClassNotFoundException
                 | InvocationTargetException |
                 InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
}
