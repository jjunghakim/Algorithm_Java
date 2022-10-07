import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //N이 주어지면 N부터 1까지 출력하시오
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //N을 받아서
        int N = Integer.parseInt(bf.readLine());

        //N부터 시작해서 1까지 도는 for문 작성 (--)
        for(int i = N; i > 0; i--){
            System.out.println(i);
        }
    }
}
