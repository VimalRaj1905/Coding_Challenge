package Day_59;
import java.util.Scanner;

public class Day59 {
    //143
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        int last = n%10;//3
        int lastrem = n/10;//14
        int sec = lastrem%10;//second 4
        int first = n/100;// first 1.43
        String ones [] = {" ","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                " ", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String tens [] = {" ","Ten","Twenty","Thirty","Fourty","Fifty","sixty","Seventy","Eighty","Ninety"};
        String hun = " Hundred ";
        if(n<20 )
        {
            System.out.println(ones[n]);
        }
        else if (n<100)
        {
            System.out.println(tens[sec]+ones[last]);

        } else if (111 ==n )
        {
            System.out.println(ones[first] + hun + ones[lastrem]);

        } else if (n>100 && n<1000)
        {
            System.out.println(ones[first] + hun + tens[sec] + ones[last] );

        }
        else
        {
            System.out.println("Invalid  ");

        }


    }
}
