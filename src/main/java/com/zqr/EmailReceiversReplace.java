package com.zqr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Kendric
 * @className EmailReceiversReplace
 * @description
 * @createTime 2023/4/22 20:38
 */

public class EmailReceiversReplace {
    public static void main(String[] args) {
        ArrayList<String> save = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String t = null;
            while (true) {
                t = sc.nextLine();
                if ("".equals(t)) {
                    break;
                }
                save.add(t);
            }
            List<String> result = new ArrayList<>();
            save.stream().forEach(item -> {
                String c = String.valueOf(item.charAt(item.length() - 1));
                if (c.equals("；")) {
                    result.add(item.replace("；", "; "));
                } else if (c.equals(")")) {
                    result.add(item.substring(item.indexOf("(") + 1, item.length() - 1) + "; ");
                } else {
                    result.add(item + "; ");
                }
            });
            System.out.println();
            System.out.println();
            System.out.println();
            result.stream().forEach(item -> {
                System.out.println(item);
            });
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
