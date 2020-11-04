package com.atguigu;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LamadaTest {
    @Test
    public void test1(){
        Consumer<String> consumer = System.out::println;
        consumer.accept("lamada");
        System.out.println();
        System.out.println("更新");
        System.out.println("二次更新");
        System.out.println("三次更新");
        System.out.println("四次更新");
        List<Integer> integers = Arrays.asList(1, 23, 4567, 34);
        integers.forEach(System.out::println);


    }

}
