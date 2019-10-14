package top.sstime.algorithm;

import org.junit.Test;

public class ListTest {

    @Test
    public void testMyArrayList() {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        for (int i = 0; i < 30; i++) {
            myArrayList.add("str " + i);
        }
        System.out.println(myArrayList.size());
        for (int i = 0; i < myArrayList.size(); i++)
            System.out.println(myArrayList.get(i));
    }
}
