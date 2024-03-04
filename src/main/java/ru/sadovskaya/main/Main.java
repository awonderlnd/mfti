package ru.sadovskaya.main;

import lombok.SneakyThrows;
import ru.sadovskaya.reflection.*;

import static ru.sadovskaya.reflection.ReflectionUtils.collect;
import static ru.sadovskaya.reflection.ReflectionUtils.reset;
import static ru.sadovskaya.reflection.Validator.validate;


public class Main {
    @SneakyThrows
    public static void main(String[] args) {


        //7.1.1
//        Entity2 entity2 = new Entity2();
//        List<Field> fields = fieldCollection(entity2);
//        for (Field f : fields) {
//            System.out.println(f.getName());
//        }
//
//        //7.1.2
//        Line line1 = new Line<>(new Point2D(1, 2), new Point2D(3, 4));
//        Line line2 = new Line<>(new Point2D(5, 6), new Point2D(7, 8));
//        System.out.println(line1);
//        System.out.println(line2);
//        lineConnector(line1, line2);
//        System.out.println(line1);
//        System.out.println(line2);
//        line1.setEnd(new Point2D(9, 10));
//        System.out.println(line1);
//        System.out.println(line2);
//        lineConnector(line1, line2);
//        System.out.println(line1);
//        System.out.println(line2);
//
//        //7.1.3
//        System.out.println(entity2);
//
//        //7.1.4
//        Human h1 = new Human("Vasia", 750);
//        Human h2 = new Human("Petia", 25);
//        System.out.println(h1);
//        System.out.println(h2);
//        validate(h2);
//        validate(h1);
//
//        //7.1.5
//        ObjectsWriter objectsWriter = new ObjectsWriter("/Users/wonderland/Desktop/test.txt");
//        objectsWriter.write(new ReadTest("test1", "test1"), new ReadTest("test2", "test2"));
//        ObjectsReader<ReadTest> reader = new ObjectsReader<>("/Users/wonderland/Desktop/test.txt");
//        List<ReadTest> list = reader.read();
//        System.out.println(list);
//
//        //7.3.1
        //System.out.println(collect(Test.class));

        //7.3.2
        Test test = new Test();
        reset(test);
        System.out.println(test);

        //System.out.println(sum(args));
//        Entity1 entity1 = new Entity1();
//        System.out.println(entity1);
//        Entity3 entity3 = new Entity3();
////        System.out.println(entity3);
//        Entity4 entity4 = new Entity4();
//        System.out.println(entity4);
    }

    public static int sum(String... args) {
        int res = 0;
        for (String s : args) {
            res += Integer.parseInt(s);
        }
        return res;
    }
}

