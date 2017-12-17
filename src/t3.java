import java.util.Objects;
import java.util.Scanner;

public class t3 {
    //判斷回文
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = "";
        for (int i = str1.length()-1 ; i >= 0 ;i --){
            str2 = str2 + str1.charAt(i);
        }
        if (Objects.equals(str1,str2)){
            System.out.println("Yes");
        }else {
            System.out.println("NO");
        }
    }
}
