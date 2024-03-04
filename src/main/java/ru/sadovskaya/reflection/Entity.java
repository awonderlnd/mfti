package ru.sadovskaya.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ToString
public abstract class Entity {

    @Override
    public final String toString() {
        List<Field> fields = ReflectionUtils.fieldCollection(this);
        Map<String, Object> fieldsMap = new HashMap<>();
        for (Field f : fields) {
            try {
                ToString toString = f.getDeclaredAnnotation(ToString.class);
                if (toString == null)
                    toString = f.getDeclaringClass().getDeclaredAnnotation(ToString.class);
                if (!(toString == null || toString.value()==NeedToString.YES)) continue;
                if (Modifier.isStatic(f.getModifiers())) continue;
                f.setAccessible(true);
                fieldsMap.put(f.getName(), f.get(this));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return this.getClass().getSimpleName() + fieldsMap;
    }
}

