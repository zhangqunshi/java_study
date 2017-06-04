package com.nastation.c11;

//: c11:DirList3.java
//Building the anonymous inner class "in-place."

import com.nastation.c09.AlphabeticComparator;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class DirList3 {
    public static void main(final String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0)
            list = path.list();
        else
            list = path.list(new FilenameFilter() {
                public boolean accept(File dir, String n) {
                    String f = new File(n).getName();
                    return f.indexOf(args[0]) != -1;
                }
            });
        Arrays.sort(list, new AlphabeticComparator());
        for (int i = 0; i < list.length; i++)
            System.out.println(list[i]);
    }
}