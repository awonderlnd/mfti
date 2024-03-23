package ru.sadovskaya.postProcessors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.sadovskaya.reflection.Cache;
import ru.sadovskaya.reflection.ReflectionUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Component
public class CacheAnnotationBeanPostProcessor implements BeanPostProcessor {
    Map<String, Object> beans = new HashMap<>();

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (Arrays.stream(bean.getClass().getDeclaredMethods()).anyMatch(m -> m.isAnnotationPresent(Cache.class)))
            beans.put(beanName,bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (beans.containsKey(beanName)) {
            beans.remove(beanName);
            return ReflectionUtils.cache(bean);
        }
        return bean;
    }
}