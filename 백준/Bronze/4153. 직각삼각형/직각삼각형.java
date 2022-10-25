import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine(), " ");

            //배열에 3개의 수 채워준다
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            //세 개의 숫자가 모두 0 이면 break;
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                break;
            }

            //정렬하기
            Arrays.sort(arr);
            
            //z^2 = x^2 + y^2
            //한꺼번에 출력 위해 StringBuilder
            if(Math.pow(arr[2], 2) == Math.pow(arr[0], 2) + Math.pow(arr[1], 2))
            {
                sb.append("right").append('\n');
            }
            else{
                sb.append("wrong").append('\n');
            }
        }
        System.out.print(sb);
        }
    }


