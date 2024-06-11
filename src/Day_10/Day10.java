package Day_10;

public class Day10 {

        public static void main(String[] args) {
            int arr [] = new int []{2,0,2,2,1,0};
            for (int i = 0;i<arr.length;i++) {
                for(int j=i+1;j<arr.length;j++) {
                    if(arr[i]>arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                System.out.println();
            }
            for(int i=0;i<arr.length;i++) {
                System.out.println(arr[i] +" ");
            }

        }





}
