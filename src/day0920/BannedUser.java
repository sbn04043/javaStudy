package day0920;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BannedUser {
    public static void main(String[] args) {
        String[] user_id = new String[]{
                "frodo",
                "fradi",
                "crodo",
                "abc123",
                "frodoc"
        };

        String[] banned_id = new String[]{
                "fr*d*",
                "abc1**"
        };

        solution(user_id, banned_id);
    }

    public static int solution(String[] user_id, String[] banned_id) {
        if (user_id.length == banned_id.length) return 1;

        int answer = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < banned_id.length; i++) {
            for (int j = 0; j < user_id.length; j++) {
                if (banned_id[i].length() == user_id[j].length()) {
                    int count = 0;
                    for (int k = 0; k < banned_id.length; k++) {
                        if (banned_id[i].charAt(k) == user_id[j].charAt(k) || banned_id[i].charAt(k) == '*') {
                            count++;
                        } else break;
                    }

                    if (count == banned_id.length) {
                        if (map.containsKey(i)) {
                            map.get(i).add(j);
                        } else {
                            List<Integer> list = new ArrayList<>();
                            list.add(j);
                            map.put(i, list);
                        }
                    }
                }
            }
        }

        System.out.println(map);

        int max = 0;
        List<Integer> usedIndex = new ArrayList<>();
        //max = Math.max(getMax(map, usedIndex), max);

        return answer;
    }

}
