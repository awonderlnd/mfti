package ru.sadovskaya.main;

import ru.sadovskaya.animals.Cat;
import ru.sadovskaya.animals.CountCollar;
import ru.sadovskaya.animals.WarningCollar;
import ru.sadovskaya.interfaces.Meowable;

import java.util.*;
import java.util.function.*;

public class Starter {

    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Cat");
        CountCollar collar1 = new CountCollar(cat);
        test(collar1);
        System.out.println(collar1.count);

        System.out.println("------------------------");
        WarningCollar warningCollar = new WarningCollar(cat);
        test(warningCollar);

        System.out.println("------------------------");
        CountCollar collar = new CountCollar(collar1);
        test(collar);
        System.out.println(collar.count);

    }

    public static void test(Meowable cat) {
        cat.meow();
    }


    class DataStream<T> {
        private final List<T> list;
        private final List actions = new ArrayList();


        private DataStream(List<T> list) {
            this.list = list;
        }

        public <T> DataStream<T> of(List<T> list) {
            return new DataStream<>(list);
        }

        public <R> DataStream<R> map(Function<T, R> function) {
            actions.add(function);
            return (DataStream) this;
        }

        public DataStream<T> filter(Predicate<T> rule) {
            actions.add(rule);
            return this;
        }

        public <R> R collect(Supplier<R> init, BiConsumer<R, T> op) {
        /* R - ArrayList; () -> {ArrayList},
        op - добавление элемента типа Т в коллекцию типа R*/
            R result = init.get();
            up:
            for (T element : list) {
                for (Object action : actions) {
                    if (action instanceof Function) {
                        Function fun = (Function) action;
                        element = (T) fun.apply(element);
                        continue;
                    }
                    if (action instanceof Predicate) {
                        Predicate rule = (Predicate) action;
                        if (!rule.test(element)) {
                            continue up;
                        }
                    }
                }
                op.accept(result, element);
            }
            return result;
        }

        public T reduce(BinaryOperator<T> operator, T start) {
            T res = start;
            up:
            for (T element : list) {
                for (Object action : actions) {
                    if (action instanceof Function) {
                        Function fun = (Function) action;
                        element = (T) fun.apply(element);
                        continue;
                    }
                    if (action instanceof Predicate) {
                        Predicate rule = (Predicate) action;
                        if (!rule.test(element)) {
                            continue up;
                        }
                    }
                }
                res = operator.apply(res, element);
            }
            return res;
        }
    }
}
