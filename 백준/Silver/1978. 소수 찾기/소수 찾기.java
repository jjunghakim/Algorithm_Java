import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //testCase
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int sosuCount= 0;

        //두번째줄 입력받아서 소수 맞다면(true) Count++
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (SosuAssert(num)) {
                sosuCount++;
            }
        }
        //출력
        System.out.println(sosuCount);
    }
    
        //소수인지 알아보는 메서드
        public static boolean SosuAssert(int num){
            // 1) 1은 소수 아님
            if(num == 1){return false;}
            
            // 소수 : 약수가 1하고 자기자신 뿐
            // 2) 2 이상 ~ 자기 자신보다 작은 수 중 나누어 떨어지는 수 있으면 소수 아님
            for(int j = 2; j < num; j++){
                if(num % j == 0){ return false;}
            }
            return true;
        }
    }

