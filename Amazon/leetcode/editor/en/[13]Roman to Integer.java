import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0;
        int end = s.length();
        for (int i = 0; i < end - 1; i++) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                res += map.get(s.charAt(i));
                System.out.println(res);
            } else {
                res -= map.get(s.charAt(i));
                System.out.println(res);
            }
        }
        return res + map.get(s.charAt(end - 1));
    }
}

