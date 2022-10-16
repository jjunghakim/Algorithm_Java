import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //숫자 A, B 입력
        String A = st.nextToken();
        String B = st.nextToken();

        //StringBuffer의 reverse로 뒤집기
        StringBuffer sb1 = new StringBuffer(A);
        StringBuffer sb2 = new StringBuffer(B);


        String rA = String.valueOf(sb1.reverse());
        String rB = String.valueOf(sb2.reverse());

        //뒤집은 값을 String -> int로 형변환하여 비교
        if(Integer.parseInt(rA) > Integer.parseInt(rB)) System.out.println(rA);
        else System.out.println(rB);

    }
}
