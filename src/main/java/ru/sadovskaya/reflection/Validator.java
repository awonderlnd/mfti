package ru.sadovskaya.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Validator {
    public static void validate(Object... objects) {
        for (Object object : objects) {
            try {
                Class[] testClasses = object.getClass().getDeclaredAnnotation(Validate.class).value();
                for (Class testClass : testClasses) {
                    Constructor cstr = testClass.getDeclaredConstructor();
                    cstr.setAccessible(true);
                    Object testerObject = cstr.newInstance();
                    Method[] tests = testClass.getDeclaredMethods();
                    for (Method t : tests) {
                        t.setAccessible(true);
                        t.invoke(testerObject, object);
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException | IllegalArgumentException |
                     NoSuchMethodException | InstantiationException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
