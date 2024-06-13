package Day_11;
import java.util.Arrays;

public class Day11 {
    public static void main(String[] args) {
        int seats [] = new int[]{3,1,5};
        int students [] = new int []{2,7,4};
        System.out.println(new Day11().minMovesToSeat(seats,students));

    }
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int res=0;
        for(int i=0;i<seats.length;i++){
            res = res+Math.abs(students[i]-seats[i]);
        }
        return res;

    }

}
