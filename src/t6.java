import java.util.Scanner;
//輾轉相除法
public class t6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = 0 ;
        for (int i = 1 ; i <= Math.min(a,b); i ++){
            if (a % i == 0 && b % i == 0 ){
                sum = i ;
            }
        }
        System.out.println(sum);
    }
}
