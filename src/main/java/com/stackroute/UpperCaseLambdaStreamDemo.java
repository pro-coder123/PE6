package com.stackroute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseLambdaStreamDemo {

    public List<String> toUpperCase(List<String> list) {


        return new ArrayList<String>(list.stream().map(x -> x.toUpperCase()).collect(Collectors.toList()));


    }

    public static int disp(String x)
    {
        System.out.println(x);
        return 1;
    }

    public static void main(String[] args) {
        UpperCaseLambdaStreamDemo x = new UpperCaseLambdaStreamDemo();
        String[] s = {"abc","fff","fjknf"};


        Arrays.asList(s).stream().forEach(x1 -> disp(x1));

//        System.out.println( x.toUpperCase(Arrays.asList(s)));
    }

}
