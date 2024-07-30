package Day_53;

public class Day53 {
    public static void main(String[] args) {
        Day53 day53 = new Day53();
        System.out.println(day53.minimumDeletions("aababbab"));
    }

    public int minimumDeletions(String s) {
        char[] letters = s.toCharArray();
        int aCount = 0;
        int bCount = 0;
        int output = Integer.MAX_VALUE;
        for (int i = 0; i < letters.length; i++)
            aCount += ('b' - letters[i]);

        for (int i = 0; i < s.length(); i++) {
            output = Math.min(output, aCount + bCount);
            aCount -= ('b' - letters[i]);
            bCount += (letters[i] - 'a');
        }

        output = Math.min(output, aCount + bCount);
        return output;
    }
}
