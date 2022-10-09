import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //num을 입력받으면
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        //입력받은 num만큼 * 출력 (오른쪽 정렬)

        //for문을 돌린다 (1부터 num까지)
        for(int i = 1; i <= num; i++){
            //공백이 들어간 for문(--되는)
            for(int j = num; j > i; j--){
                System.out.print(" ");
            }
            //*이 들어가는 for문(++되는)
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
