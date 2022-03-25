package com.licc.march;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * map 根据key进行排序
 */
public class MapKeySort {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();

        int n = Integer.parseInt(s1.split(" ")[0]);
        int a = Integer.parseInt(s1.split(" ")[1]);
        String[] si = s2.split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++){
            map.put(i, Integer.parseInt(si[i - 1]));
        }

        List<Map.Entry> list = map.entrySet().stream().sorted((n1, n2)->{
            if(n1.getValue().equals(n2.getValue())){
                return n1.getKey() - n2.getKey();
            }else {
                return n2.getValue() - n1.getValue();
            }
        }).collect(Collectors.toList());

        for (Map.Entry each : list){
            System.out.print(each.getKey() + " ");
        }
        System.out.println();

        int result = 0;
        for (Map.Entry each : list){
            if(each.getKey().equals(a)){
                break;
            }
            result++;
        }

        System.out.println(result);
    }


}
