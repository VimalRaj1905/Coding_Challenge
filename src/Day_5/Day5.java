package Day_5;
import com.sun.tools.javac.Main;

import java.util.*;
import java.util.List;

public class Day5 {
    public static void main(String[] args) {
        Day5 v = new Day5();
        System.out.println(v.replaceWords(List.of("cat","rat","bat"),"the cattle was rattled by the battery "));
    }
    public String replaceWords(List<String> dictionary, String sentence) {

        Set<String> s = new HashSet<>(dictionary);
        List<String> temp = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        StringBuilder res = new StringBuilder();
        for (String t : temp) {
            int i = 0;
            while (i <= t.length()) {
                String curr = t.substring(0, i);
                if (s.contains(curr)) {
                    res.append(curr).append(" ");
                    break;
                }
                i++;
            }
            if (i == t.length() + 1) {
                res.append(t).append(" ");
            }
        }
        res.deleteCharAt(res.length() - 1);
        return res.toString();
    }}