import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int result = 0;

        //n받은 만큼 for문을 돌리는데
        for(int i = 0; i < n; i++){
            int num = i;
            int sum = 0;

            while(num != 0){
                sum += num % 10; //num + 1의자리
                num /= 10; //각 자리수 더해준 것
            }

            if(sum + i == n){
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}
