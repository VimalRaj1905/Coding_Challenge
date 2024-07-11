package Day_36;

public class Day36 {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        System.out.println(new Day36 ().minOperations(logs));

    }
    public int minOperations(String[] logs) {
        int folderDepth = 0;


        for (String currentOperation : logs) {

            if (currentOperation.equals("../")) {
                folderDepth = Math.max(0, folderDepth - 1);
            }

            else if (!currentOperation.equals("./")) {

                folderDepth++;
            }

        }

        return folderDepth;

    }
}
