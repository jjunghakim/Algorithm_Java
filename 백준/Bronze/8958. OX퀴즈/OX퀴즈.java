import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        //test 케이스 주어짐
        int t = Integer.parseInt(st.nextToken());


        //문자열들 t개의 줄로 입력함
        for (int i = 0; i < t; i++) {
            int sum = 0;
            int cnt = 0;
            String line = br.readLine();
            //한 줄씩 점수 계산하기
            for (int j = 0; j < line.length(); j++) {

                //줄에서 O 일 경우 cnt 증가하고, sum에 cnt값 더하기
                //O가 연속될 경우 if 조건(true) 만족하므로 cnt++ 됨
                if (line.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                }
                //X일 경우
                else {
                    cnt = 0;
                }
            }
            //각각의 줄 한꺼번에 출력하기 위해 string builder append
                sb.append(sum).append('\n');
        }
            System.out.println(sb);
    }
}
