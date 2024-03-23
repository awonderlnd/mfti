package ru.sadovskaya.postProcessors;

import jakarta.annotation.Nullable;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
import ru.sadovskaya.reflection.Validate;
import ru.sadovskaya.reflection.Validator;

@Component
public class ValidateAnnBeanPostPr implements BeanPostProcessor {
    @Nullable
    public Object postProcessAfterInitialization(Object bean, String beanName) throws org.springframework.beans.BeansException {
        if (bean.getClass().isAnnotationPresent(Validate.class)) {
            Validator.validate(bean);
        }
        return bean;
    }
}
