package Day_29;

public class Day29 {
    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 6, 1, 3, 5};
        System.out.println(new Day29().threeConsecutiveOdds(arr));;
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        int a = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                a++;
            }
            else{
                a = 0;
            }
            if(a==3){
                return true;
            }
        }
        return false;
    }
}
