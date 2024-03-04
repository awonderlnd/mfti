package ru.sadovskaya;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.sadovskaya.reflection.*;

public class EntityTests {
    Entity1 entity1 = new Entity1();
    Entity2 entity2 = new Entity2();
    Entity3 entity3 = new Entity3();
    Entity4 entity4 = new Entity4();

    @Test
    @DisplayName("toString() correct")
    void test1() {
        Assertions.assertEquals("Entity2{string1=Test1, string2=Test2, x1=11}",
                entity2.toString(), "Метод работает некорректно");
    }

    @Test
    @DisplayName("fields are NOT accessible")
    @Disabled
    /* Как я поняла, такие уточняющие тест не нужны, поэтому выключила
    если тест отрицательный - всё ок, если прошел, то доступа к полям нет
    т.е. отсутствует f.setAccessible(true);*/
    void test2() {
        Assertions.assertThrows(RuntimeException.class, () -> entity1.toString(),
                "Отсутствует доступ к полям");
    }

    @Test
    @DisplayName("NeedToString.NO isn't included in toString()")
    void test3() {
        //проверка на второй if
        Assertions.assertNotEquals("Entity2{string1=Test1, string2=Test2, x1=11, x2=22}",
                entity2.toString(), "Отображаются поля с NeedToString.NO");
    }

    @Test
    @DisplayName("doesn't throw exception")
    void test4() {
      /* Не нашла как проверить, что метод не кидает именно NullPointerException если
        убрать проверку на toString != null во втором if. Нужно ли в целом проверять такие нюансы?
        Assertions.assertThrows(NullPointerException.class, () -> entity3.toString());*/
        Assertions.assertDoesNotThrow(() -> entity3.toString(), "Метод кидает ошибку");
    }

    @Test
    @DisplayName("NeedToString.YES on class is not included in toString()")
    void test5() {
        //проверка на toString.value()!=NeedToString.YES во втором if
        Assertions.assertNotEquals("Entity4{string1=Test1, string2=Test2, x1=11}",
                entity4.toString(), "Не отображаются поля с NeedToString.YES на классе");
    }

    @Test
    @DisplayName("static fields isn't included in toString()")
    void test6() {
        //проверка на третий if
        Assertions.assertNotEquals("Entity4{string4=Test4, string1=Test1, string2=Test2, x1=11, x4=44}",
                entity4.toString(), "Отображаются статические поля класса");
    }

}
