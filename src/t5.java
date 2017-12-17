import java.util.Scanner;
//矩陣反轉
public class t5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(),m = scn.nextInt();
        int [][] arr = new int [m][n];
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < m ; j ++){
                arr [j][i] = scn.nextInt();
            }
        }
        for (int i = 0 ; i < m ; i ++ ){
            for (int j = 0 ; j < n ; j ++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
