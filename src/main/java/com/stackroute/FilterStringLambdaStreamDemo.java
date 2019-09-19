package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterStringLambdaStreamDemo {

    public List<String> search(List<String> list) {

        return list.stream().filter(s -> s.startsWith("a") && s.length() == 3).collect(Collectors.toList());

    }

    public static void main(String[] args) {



    }



}
