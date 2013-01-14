package com.test.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTester {
    public static void main(String args[]) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Dog dog = new Dog();

        Class classType = dog.getClass();

        Field field = classType.getDeclaredField("speed");
        System.out.println(field.get(dog));
        Method method=classType.getMethod("run");
        method.invoke(dog);
    }
}
