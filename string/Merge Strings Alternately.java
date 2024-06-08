import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder res = new StringBuilder();
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                res.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                res.append(word2.charAt(i));
            }
            i++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        try {
            File file = new File("C:\\Users\\mk\\Documents\\LeetCode Java\\in.txt");
            Scanner input = new Scanner(file);
            PrintWriter writer = new PrintWriter("C:\\Users\\mk\\Documents\\LeetCode Java\\out.txt", "UTF-8");
            int n = input.nextInt();
            Solution sol = new Solution();
            for (int i = 0; i < n; i++) {
                String word1 = input.next();
                String word2 = input.next();
                writer.println(sol.mergeAlternately(word1, word2));
            }
            writer.close();
            input.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}