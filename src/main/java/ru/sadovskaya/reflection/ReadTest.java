package ru.sadovskaya.reflection;

public class ReadTest {
    String str1;
    String str2;

    public ReadTest(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public String toString() {
        return "ReadTest{" +
                "str1='" + str1 + '\'' +
                ", str2='" + str2 + '\'' +
                '}';
    }
}
