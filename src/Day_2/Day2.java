package Day_2;

public class Day2 {

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("nlaebolko"));
        System.out.println(maxNumberOfBalloons("loonbalxballpoon"));
    }

    static int[] balloonAlph;
    public static int maxNumberOfBalloons(String text) {
        if (text.length() < 7) return 0;
        int[] alphabet = new int[26];
        for (char c : text.toCharArray()) alphabet[c - 'a']++;
        balloonAlph = balloonAlph == null ? createBalloonAlph() : balloonAlph;
        int count = 0;
        while (containsBalloon(alphabet)) count++;
        return count;
    }

    private static boolean containsBalloon(int[] alphabet) {
        for (int i = 0; i < balloonAlph.length; i++) {
            int count = balloonAlph[i], countA = alphabet[i];
            if (countA < count) return false;
            else alphabet[i] -= count;
        }
        return true;
    }

    private static int[] createBalloonAlph() {
        String s = "balloon";
        int[] alphabet = new int[26];
        for (char c : s.toCharArray()) alphabet[c - 'a']++;
        return alphabet;
    }
}
