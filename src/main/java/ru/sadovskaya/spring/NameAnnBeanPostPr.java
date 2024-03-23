package ru.sadovskaya.spring;

import jakarta.annotation.Nullable;
import lombok.SneakyThrows;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;


@Component
public class NameAnnBeanPostPr implements BeanPostProcessor {
    @SneakyThrows
    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws org.springframework.beans.BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field f : fields) {
            if (f.getName() != "name" || f.getType() != String.class) continue;
            f.setAccessible(true);
            if (f.get(bean) == null || f.get(bean) == ""){
                f.set(bean, "vasia");
            }
        }
        return bean;
    }
}
