package ru.sadovskaya.spring;

import jakarta.annotation.Nullable;
import lombok.SneakyThrows;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import ru.sadovskaya.reflection.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class DefaultAnnBeanPostPr implements BeanPostProcessor {
    @Nullable
    @SneakyThrows
    public Object postProcessAfterInitialization(Object bean, String beanName) throws org.springframework.beans.BeansException {
        //List<Field> fields = ReflectionUtils.fieldCollection(bean);
        //Map<String, Object> fieldsMap = new HashMap<>();
//        AnnotationConfigApplicationContext context =
//                new AnnotationConfigApplicationContext(bean.getClass());
//        for (Field f : fields) {
//            Default def = f.getDeclaredAnnotation(Default.class);
//            f.setAccessible(true);
//            if (def != null) {
//                f.set(bean,context.getBean(def.beanName()));
//            }
//            if (def == null)
//                def = f.getDeclaringClass().getDeclaredAnnotation(Default.class);
//            if (def == null) continue;
        if (bean.getClass().isAnnotationPresent(Default.class)) {
            ReflectionUtils.reset(bean);
        }

        //System.out.println("reset");
        return bean;
    }
}
