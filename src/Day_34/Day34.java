package Day_34;

public class Day34 {
    public static void main(String[] args) {
        int n = 4;
        int time = 5;
        System.out.println(new Day34().passThePillow(n, time));
    }


    public int passThePillow(int n, int time) {
        int cycle = (n - 1) * 2;
        int post = time % cycle;
        if (post < n) {
            return post + 1;
        } else {
            return cycle - post + 1;
        }
    }
}
