package com.nastation.c11;

//: c11:DirList.java
// Displays directory listing.

import java.io.File;
import java.io.FilenameFilter;

//import com.nastation.c09.AlphabeticComparator;

public class DirList {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }
//		Arrays.sort(list, new AlphabeticComparator());
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}

class DirFilter implements FilenameFilter {
    String afn;

    DirFilter(String afn) {
        this.afn = afn;
    }

    public boolean accept(File dir, String name) {
        System.out.println("1====" + dir);
        System.out.println("2====" + name);
        // Strip path information:
        String f = new File(name).getName();
        return f.indexOf(afn) != -1;
    }
}