package com.example.Katas.divideListItemsByNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DivideListItemsByNumber {

    public static List<Integer> listItemIsDivisibleByNumber(List<Integer> list, int num) {
        List<Integer> newList = new ArrayList<Integer>();
        newList = list.stream().filter(item -> item % num == 0).collect(Collectors.toList());
        return newList;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        List<Integer> list2 = new ArrayList<Integer>(List.of(1,2,3,4,5,6,7,8,9,10));

        System.out.println(listItemIsDivisibleByNumber(list2, 4));

    }
}

