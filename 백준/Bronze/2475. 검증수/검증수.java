import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int sixth = 0;

        sixth = (int)(((Math.pow(a, 2)) + (Math.pow(b, 2)) + (Math.pow(c, 2))
                + (Math.pow(d, 2)) + (Math.pow(e, 2)))% 10);

        System.out.println(sixth);
        
    }
}
