package Day_3;
import java.util.*;

public class Day3 {
    public static void main(String[] args) {
        Day3 day3 = new Day3();
        System.out.println(day3.commonChars(new String[]{"bella","label","roller"}));
        System.out.println(day3.commonChars(new String[]{"cool","lock","cook"}));
    }


    public List<String> commonChars(String[] words) {
        int[] common = new int[26];
        Arrays.fill(common, Integer.MAX_VALUE);
        for(String word: words){
            int[] cnt = new int[26];
            for(char c:word.toCharArray()){
                cnt[c-'a']++;
            }
            for(int i=0;i<26;i++){
                common[i] = Math.min(common[i], cnt[i]);
            }
        }
        List<String> ans = new ArrayList();

        for(int i=0;i<26;i++){
            for(int j=0;j<common[i];j++){
                ans.add(""+(char)('a'+i));
            }
        }
        return ans;
    }
}