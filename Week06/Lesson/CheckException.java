package Week06.Lesson;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CheckException {
    public static void main(String[] args) throws ParseException, InterruptedException {
        new SimpleDateFormat("MM, dd, yyyy").parse("invalid-date");
        String strObj = null;
        strObj.equals("Hello World");
int[] nums = new int[] {1, 2, 3};
int numFromNegativeIndex = nums[-1];
String str = "Hello World";
char charAtNegativeIndex = str.charAt(-1);
String str1 = "100ABCD";
int x = Integer.parseInt(str1);
int illegalOperation = 30/0;
Thread.sleep(-10000);
    }
}
