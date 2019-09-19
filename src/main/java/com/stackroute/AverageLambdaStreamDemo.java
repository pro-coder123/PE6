package com.stackroute;

import java.util.ArrayList;
import java.util.List;

public class AverageLambdaStreamDemo {
    public Double average(List<Integer> list)
    {
        int i;
        double s = 0;
        for(i=0;i<list.size();i++)
            s += list.get(i);

        s /= list.size();
        return new Double(s);
    }
}


