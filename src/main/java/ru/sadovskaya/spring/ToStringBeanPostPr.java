package ru.sadovskaya.spring;

import jakarta.annotation.Nullable;
import lombok.SneakyThrows;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.sadovskaya.reflection.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class ToStringBeanPostPr implements BeanPostProcessor {
    @Nullable
    @SneakyThrows
    public Object postProcessAfterInitialization(Object bean, String beanName) throws org.springframework.beans.BeansException {
        List<Field> fields = ReflectionUtils.fieldCollection(bean);
        Map<String, Object> fieldsMap = new HashMap<>();
        for (Field f : fields) {
            ToString toString = f.getDeclaredAnnotation(ToString.class);
            if (toString == null)
                toString = f.getDeclaringClass().getDeclaredAnnotation(ToString.class);
            if (toString == null || toString.value() == NeedToString.NO) continue;
            if (Modifier.isStatic(f.getModifiers())) continue;
            f.setAccessible(true);
            fieldsMap.put(f.getName(), f.get(bean));
            //Method method = bean.getClass().getDeclaredMethod("toString");
            //System.out.println(bean.getClass().getSimpleName() + fieldsMap);
        }
        
        return bean;
    }
}
