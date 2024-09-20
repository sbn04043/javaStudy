package day0919;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaEx {
    public static void main(String[] args) {

    }
    public int solution(int n, int[][] edge) {
        int answer = 0;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int[] ints : edge) {
            if (map.containsKey(ints[0])) {
                List<Integer> temp = new ArrayList<>();
                temp.add(ints[1]);
                map.put(ints[0], temp);
            } else {
                map.get(ints[0]).add(ints[1]);
            }

            if (map.containsKey(ints[1])) {
                List<Integer> temp = new ArrayList<>();
                temp.add(ints[0]);
                map.put(ints[1], temp);
            } else {
                map.get(ints[1]).add(ints[0]);
            }
        }
        System.out.println("map: " + map);

        return answer;
    }
}
