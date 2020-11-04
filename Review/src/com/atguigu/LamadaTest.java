package com.atguigu;

import org.junit.Test;

import java.util.function.Consumer;

public class LamadaTest {
    @Test
    public void test1(){
        Consumer<String> consumer = System.out::println;
        consumer.accept("lamada");

    }
}
