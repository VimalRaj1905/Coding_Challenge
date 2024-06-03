package Day_1;

public class Day1 {
    public static void main(String[] args) {
        System.out.println(appendCharacters("Coaching","Coding"));
    }

    public static int appendCharacters(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length()&&j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                j++;
            }
            i++;
        }
        return t.length()-j;
    }
}
