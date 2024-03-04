package ru.sadovskaya.interfaces;

import ru.sadovskaya.interfaces.Converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Db {


    private final List<String> data = new ArrayList<>();
    private final Map<Class, Converter> converters = new HashMap<>();

    public <T> void addConverter(Converter<T> converter, Class<T> clz) {
        converters.put(clz, converter);
    }

    public void add(String str) {
        data.add(str);
    }

    public <T> T get(int index, Class<T> clazz) {
        String str = data.get(index);
        Converter<T> converter = converters.get(clazz);
        return converter.convert(str);
    }
}
