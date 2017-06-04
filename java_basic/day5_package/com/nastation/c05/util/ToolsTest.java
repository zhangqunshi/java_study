package com.nastation.c05.util;

public class ToolsTest {

    public static void main(String[] args) {
        Tools.println("Available from now on!");
        Tools.println("" + 100); // Force it to be a String
        Tools.println("" + 100L);
        Tools.println("" + 3.14159);
    }
}
