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

        //n개의 서로 다른 것 중에서 k개를 선택하는 조합
        // N! / (N-K)!K!

        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));

    }

    //N의 팩토리얼 구하고
    //팩토리얼 구하는 것.. N, N-1, N-2, ..., 1 이 될때까지 곱하는거임
    public static int factorial(int n) {
        int i = 1;
        for (int j = 1; j <= n; j++) {
            i *= j;
        }
        return i;
    }
}
