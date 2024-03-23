package ru.sadovskaya.reflection;

import lombok.SneakyThrows;
import ru.sadovskaya.geometry.Line;

import java.lang.reflect.*;
import java.util.*;

public class ReflectionUtils {
    public static List<Field> fieldCollection(Object object) {
        List<Field> fieldList = new ArrayList<>();
        Class currentClass = object.getClass();
        if (currentClass.equals(Object.class)) {
            return fieldList;
        }
        while (!currentClass.equals(Object.class)) {
            fieldList.addAll(Arrays.asList(currentClass.getDeclaredFields()));
            currentClass = currentClass.getSuperclass();
        }
        return fieldList;
    }

    public static void lineConnector(Line line1, Line line2) {
        try {
            Field lineEnd = Line.class.getDeclaredField("end");
            lineEnd.setAccessible(true);
            Field lineStart = Line.class.getDeclaredField("start");
            lineStart.setAccessible(true);
            lineStart.set(line2, lineEnd.get(line1));
        } catch (NoSuchFieldException | SecurityException
                 | IllegalAccessException | IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }

    @SneakyThrows
    public static Map<String, Object> collect(Class... classes) {
        List<Method> methodList = new ArrayList<>();
        Map<String, Object> resMap = new HashMap<>();
        Map<Method, Class> methodClassMap = new HashMap<>();
        for (Class clz : classes) {
            Method[] methods = clz.getDeclaredMethods();
            for (Method m : methods) {
                methodClassMap.put(m, clz);
            }
            methodList.addAll(Arrays.asList(clz.getDeclaredMethods()));
        }
        for (Method method : methodList) {
            if (method.getParameterCount() == 0 && method.getReturnType() != Void.TYPE
                    && method.isAnnotationPresent(Invoke.class)) {
                Class currentClass = methodClassMap.get(method);
                Constructor cstr = currentClass.getDeclaredConstructor();
                cstr.setAccessible(true);
                Object testerObject = cstr.newInstance();
                method.setAccessible(true);
                Object returnObject = method.invoke(testerObject);
                resMap.put(method.getName(), returnObject);
            }
        }
        return resMap;
    }

    @SneakyThrows
    public static void reset(Object... objects) {
        for (Object o : objects) {
            List<Field> fields = new ArrayList<>(ReflectionUtils.fieldCollection(o));
            for (Field f : fields) {
                Default def = f.getDeclaredAnnotation(Default.class);
                if (def == null)
                    def = f.getDeclaringClass().getDeclaredAnnotation(Default.class);
                if (def == null) continue;
                f.setAccessible(true);
                Type type = f.getType();
                Method[] methods = Default.class.getDeclaredMethods();
                for (Method m : methods) {
                    m.setAccessible(true);
                    if (m.getReturnType() == type) {
                        f.set(o, m.invoke(def));
                    }
                }
            }
        }
    }

    public static <T> T cache(T objectIncome){

        ClassLoader objectIncomeClassLoader = objectIncome.getClass().getClassLoader();
        Class[] objectIncomeInterfaces = objectIncome.getClass().getInterfaces();

        T proxyObject = (T) Proxy.newProxyInstance(objectIncomeClassLoader,
                objectIncomeInterfaces,
                new ObjectInvocationHandler<>(objectIncome));
        return proxyObject;
    }
}
