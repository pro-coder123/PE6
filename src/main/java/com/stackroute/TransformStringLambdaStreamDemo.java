package com.stackroute;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TransformStringLambdaStreamDemo {

    public static String getString(List<Integer> list) {

        return list.stream().map(i -> i%2 == 0 ? "e"+i.toString() : "o"+i.toString()).collect(Collectors.joining(","));

    }



    public static void main(String[] args) {


            System.out.println(getString(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));

    }
}