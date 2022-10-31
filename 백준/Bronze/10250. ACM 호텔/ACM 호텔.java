import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            int H = Integer.parseInt(st2.nextToken());
            int W = Integer.parseInt(st2.nextToken());
            int N = Integer.parseInt(st2.nextToken());

            System.out.println(searchRoom(H, W, N));
        }
    }

    public static int searchRoom(int H, int W, int N) {
        int count = 1;

        for (int k = 1; k <= W; k++) {
            for (int j = 1; j <= H; j++) {
                if (N == count) {
                    return Integer.parseInt(String.format("%d%02d", j, k));
                                                        // H(H)0W
                }
                count++;
            }
        }
        return 0;
    }
}

