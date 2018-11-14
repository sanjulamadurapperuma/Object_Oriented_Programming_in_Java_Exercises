package com.sanjula.oop.java.tutorials.week_5;

import java.util.ArrayList;

public class Arrays {

    private static int[] one;
    private static int[] two;
    private static int[] three;
    private static int[] four;
    private static int[] five;

    private static ArrayList<Integer> intList1 = new ArrayList<>();
    private static ArrayList<Integer> intList2 = new ArrayList<>();
    private static ArrayList<Integer> intList3 = new ArrayList<>();

    public static void main(String[] args) {

        one = new int[]{7};
        two = new int[]{3, 6};
        three = new int[]{4, 6, 8};
        four = new int[]{1, 2, 3, 4};
        five = new int[]{8, 4, 2, 0, 4};

        loadArray(one);
        loadArray(two);
        loadArray(three);
        loadArray(four);
        loadArray(five);

        intList1.add(5);
        intList1.add(10);
        intList1.add(15);

        intList2.add(8);
        intList2.add(2);
        intList2.add(8);
        intList2.add(7);
        intList2.add(4);

        intList3.add(-1);
        intList3.add(3);
        intList3.add(28);
        intList3.add(17);
        intList3.add(9);
        intList3.add(30);


        listDemo(intList1);
        listDemo(intList2);
        listDemo(intList3);
    }

    public static void loadArray(int[] list) {
        for (int i = 1; i < list.length; i++)
        {
            list[i] = list[i] + list[i - 1];
        }
        System.out.println(list);
    }

    public static void listDemo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
        {
            int element = list.get(i);
            list.remove(i);
            list.add(0, element + 1);
        }
        System.out.println(list);
    }

    @Override
    public String toString() {
        return "[" +  "]";
    }
}
