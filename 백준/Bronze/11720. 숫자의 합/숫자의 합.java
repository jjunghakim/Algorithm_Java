import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //두번째 줄의 숫자를 배열로 입력 받는다
        String[] str = br.readLine().split("");
        
        //합해질 결과 변수 선언
        int result = 0;

        //
        for(String i : str){
            result += Integer.parseInt(i);
        }

        System.out.println(result);

    }
}
