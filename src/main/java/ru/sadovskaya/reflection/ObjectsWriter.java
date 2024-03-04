package ru.sadovskaya.reflection;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ObjectsWriter {
    FileWriter file;

    public ObjectsWriter(String fileName) throws IOException {
        this.file = new FileWriter(fileName);
    }

    public void write(Object... objects) {
        try {
            for (Object o : objects) {
                Class clz = o.getClass();
                file.write(clz + " ");
                Constructor[] constructors = clz.getDeclaredConstructors();
                for (Constructor constructor : constructors) {
                    constructor.setAccessible(true);
                    Field[] fields = clz.getDeclaredFields();
                    for (Field field : fields) {
                        field.setAccessible(true);
                        file.write(field.get(o) + " ");
                    }
                }
                file.write("\n");
            }
            file.close();
        } catch (IOException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}

