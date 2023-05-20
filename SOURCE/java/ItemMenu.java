package com.fadhilah.algolearn;

import java.util.ArrayList;

public class ItemMenu {
    public static String[][] data = new String[][]{
            {"SORT", "4 Algorithm"},
            {"SEARCH", "3 Algorithm"},
            {"TREE", "2 Algorithm"},
            {"GRAPH", "5 Algorithm"}
    };

    private static int[] iconMenu = {
            R.drawable.sort,
            R.drawable.search,
            R.drawable.tree,
            R.drawable.graph
    };

    public static ArrayList<Item> getListData() {
        ArrayList<Item> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            Item item = new Item();
            item.setTitle(data[i][0]);
            item.setSubtitle(data[i][1]);
            item.setGambar(iconMenu[i]);
            list.add(item);
        }
        return list;
    }
}
