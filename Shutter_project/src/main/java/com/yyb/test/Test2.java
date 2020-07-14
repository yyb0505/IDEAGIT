package com.yyb.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author yuyongbo
 * @create 2020-07-14 16:17
 */
public class Test2 {

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<>();
        paths.add(new ArrayList<String>() {
            {
                add("A");
                add("B");
            }
        });
        paths.add(new ArrayList<String>() {
            {
                add("B");
                add("C");
                add("D");
                add("E");
            }
        });
        paths.add(new ArrayList<String>() {
            {
                add("E");
                add("F");
            }
        });

        String destCity = destCity(paths);
        System.out.println(destCity);
    }

    public static String destCity(List<List<String>> paths) {
        List<String> startLoca = new ArrayList<String>();
        List<String> endLoca = new ArrayList<String>();
        for (List<String> locations : paths) {
            startLoca.add(locations.get(0));
            endLoca.add(locations.get(locations.size() - 1));
        }

        endLoca.removeAll(startLoca);
        return endLoca.get(0);
    }
}
