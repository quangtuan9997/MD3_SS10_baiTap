package bai1;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(10);
        listInteger.add(9,111111);
        listInteger.add(10,22);
        System.out.println(listInteger);
        listInteger.remove(2);
        System.out.println(Arrays.asList(listInteger));
        MyList<Integer> cloneList = (MyList<Integer>) listInteger.clone();
        System.out.println(cloneList);
        cloneList.clear();
        System.out.println(Arrays.asList(cloneList));
        System.out.println( listInteger.indexOf(4));
    }
}
