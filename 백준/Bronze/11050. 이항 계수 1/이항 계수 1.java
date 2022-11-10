import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //이항계수 = n개의 서로 다른 것 중에서 k개를 선택하는 조합
        // N! / (N-K)!K!

        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }
    
    //팩토리얼 메서드 
    // N, N-1, N-2, ..., 1 이 될때까지 곱하기
    public static int factorial(int a) {
        int i = 1;
        for(int j = a; j >= 1; j--) {
            i *= j;
        }
        return i;
    }
}
