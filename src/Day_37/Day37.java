package Day_37;

public class Day37 {
    public static void main(String[] args) {
        String s = "cdbcbbaaabab ";
        int x = 4;
        int y = 5;
        System.out.println(new Day37 ().maximumGain(s,x,y));

    }
    public int maximumGain(String s, int x, int y) {

        int aCount = 0;
        int bCount = 0;
        int lesser = Math.min(x, y);
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'b') {
                result += Math.min(aCount, bCount) * lesser;
                aCount = 0;
                bCount = 0;
            } else if (c == 'a') {
                if (x < y && bCount > 0) {
                    bCount--;
                    result += y;
                } else {
                    aCount++;
                }
            } else {
                if (x > y && aCount > 0) {
                    aCount--;
                    result += x;
                } else {
                    bCount++;
                };
            }
        }

        result += Math.min(aCount, bCount) * lesser;

        return result;

    }
}
