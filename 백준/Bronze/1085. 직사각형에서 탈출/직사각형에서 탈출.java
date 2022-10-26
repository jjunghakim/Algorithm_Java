import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        //x y w h
        //6 2 10 3
        //(6,2) (10,3)

        //직사각형의 길이는 w, h와도 같음
        //경계선에 닿을려면..
        // 점(y)을 h까지 올리거나, 0까지 내리거나
        // 점(x)을 w까지 더하거나, 0까지 빼거나
        
        int[] arr = new int[4];
        int[] c = new int[4];
        //for문 돌려서 x y w h 입력받기
        for(int i = 0; i < 4; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        //새 배열에 넣고 가장 작은값 출력
        c[0] = arr[3] - arr[1];
        c[1] = arr[1];
        c[2] = arr[2] - arr[0];
        c[3] = arr[0];

        Arrays.sort(c);

        System.out.println(c[0]);
    }
}
