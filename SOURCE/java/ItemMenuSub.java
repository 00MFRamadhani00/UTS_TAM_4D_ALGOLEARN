package com.fadhilah.algolearn;

import java.util.ArrayList;

public class ItemMenuSub {
    public static String[][] data = new String[][]{
            {"Bubble Sort"},
            {"Selection Sort"},
            {"Insertion Sort"},
            {"Heap Sort"}
    };

    public static ArrayList<ItemSub> getListData() {
        ArrayList<ItemSub> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            ItemSub item = new ItemSub();
            item.setTitle(data[i][0]);
            list.add(item);
        }
        return list;
    }
}
