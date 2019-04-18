package com.company;

public class Series {

    public int sumSeries(int a) {
        int n = 0, i,k;
        for (i = 1; i <= a; i++)
            n =(3*n-2);
            k=1/n;
        return k;
    }
}
