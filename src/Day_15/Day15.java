package Day_15;

public class Day15 {
    public static void main(String[] args) {
        int c = 9;
        System.out.println(new Day15().judgeSquareSum(c));

    }
    public boolean judgeSquareSum(int c)
    {
        long a = 0, b = (int)Math.sqrt(c);

        while(a <= b)
        {
            long sum = (a * a) + (b * b);
            if(sum == c)
            {
                return true;
            }
            else if(sum > c)
            {
                b --;
            }
            else
            {
                a ++;
            }
        }
        return false;
    }
}
