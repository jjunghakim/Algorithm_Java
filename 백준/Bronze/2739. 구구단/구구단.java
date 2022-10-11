import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        //N을 입력받은 뒤
        int N = Integer.parseInt(st.nextToken());
        //N단을 출력하는 프로그램 작성

        //for문을 돌려서(1부터 9번만큼)
        //N * i = N*i (result)
        for(int i = 1; i<=9; i++){
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
