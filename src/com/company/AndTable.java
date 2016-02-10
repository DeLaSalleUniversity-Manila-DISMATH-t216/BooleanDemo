package com.company;

public class AndTable {

    public static void main(String[] args) {

        boolean p = true;
        boolean q = true;

        System.out.println("=================================");
        System.out.println("    p     |     q    |   p && q  ");
        System.out.println("=================================");
        System.out.println("  " + !p + "   |   " +!q+ "  |   " + (!p && !q));
        System.out.println("  " + !p + "   |   " +q+ "   |   " + (!p && q));
        System.out.println("  " + p + "    |   " +!q+ "  |   " + (p && !q));
        System.out.println("  " + p + "    |   " +q+ "   |   " + (p && q));
        System.out.println("=================================");
    }
}
