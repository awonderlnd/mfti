package ru.sadovskaya.postProcessors;

import jakarta.annotation.Nullable;
import lombok.SneakyThrows;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import ru.sadovskaya.reflection.Default;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class NamingPostProcessor implements BeanPostProcessor {

    @Override
    @Nullable
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        vasia(bean);
        return bean;
    }

    @SneakyThrows
    private void vasia(Object bean) {
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field f : fields) {
            if (!f.getName().equals("name") || f.getType() != String.class) continue;
            f.setAccessible(true);
            if (f.get(bean) == null || f.get(bean) == "") {
                f.set(bean, "vasia");
            }
        }
    }
}