import java.util.Scanner;

public class t8 {
    //各位數和排序
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] an = new int[n];
        for (int a = 0 ; a < n ; a ++){
            an [a] = scn.nextInt();
        }
        for (int d = 0 ; d < n-1 ; d ++){
            for (int e = d+1 ; e < n ; e ++){
                int sum1 = s1(an[d]);
                int sum2 = s1(an[e]);
                if (sum2 < sum1){
                    int val2 = an[d];
                    an[d] = an[e];
                    an[e] = val2;
                }else if (sum2 == sum1){
                    if (an[e] < an [d]){
                        int val2 = an[d];
                        an[d] = an[e];
                        an[e] = val2;
                    }
                }
            }
        }
        for(int f = 0 ; f < n ; f++){
            System.out.print(an[f]+" ");
        }
        System.out.println();
    }
    public static int s1(int x){
        String t1 = Integer.toString(x);
        int num = 0;
        for (int i = 0 ; i < 4 ; i ++){
            num += (int)t1.charAt(i);
        }
        return num ;
    }
}
