package Day_55;

public class Day55 {
    public static void main(String[] args) {
        String details[]= {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int ans = 0;
        for (int i=0;i< details.length;i++) {
            int age = Integer.parseInt(details[i].substring(11,13));
            if(age>60){
                ans++;
            }
            System.out.println("age is "+age);
        }
        System.out.println("To above 60+ age members :"+ans);
    }
}
