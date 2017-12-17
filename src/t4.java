import java.util.Scanner;
//OOXX
public class t4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [][] arr = new int[3][3];
        for (int i = 0 ; i < 3 ; i ++){
            for (int j = 0 ; j < 3 ; j ++){
                arr [i][j] = scn.nextInt();
            }
        }
        if (arr [0][0] == arr [0][1] && arr [0][1] ==arr [0][2]){
            System.out.println("True");
        }else if (arr [1][0] == arr [1][1] && arr [1][1] ==arr [1][2]){
            System.out.println("True");
        }else if (arr [2][0] == arr [2][1] && arr [2][1] ==arr [2][2]){
            System.out.println("True");
        }else if (arr [0][0] == arr [1][0] && arr [1][0] ==arr [2][0]){
            System.out.println("True");
        }else if (arr [0][1] == arr [1][1] && arr [1][1] ==arr [2][1]){
            System.out.println("True");
        }else if (arr [0][2] == arr [1][2] && arr [1][2] ==arr [2][2]){
            System.out.println("True");
        }else if (arr [0][0] == arr [1][1] && arr [1][1] ==arr [2][2]){
            System.out.println("True");
        }else if (arr [0][2] == arr [1][1] && arr [1][1] ==arr [2][0]){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
