import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            //ascending : 1 ~ 8
            //decsending : 8 ~ 1
            //else mixed

        //입력받을 배열 선언
        int[] arr = new int[8];

        //배열 채우기
        for(int i = 0; i < 8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //arr과 비교할 ascending, desending 배열 선언
        int[] asc = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] desc = {8, 7, 6, 5, 4, 3, 2, 1};

        //배열 비교 Arrays.equals 메서드 사용
        if(Arrays.equals(arr, asc)){
            System.out.println("ascending");
        } else if (Arrays.equals(arr, desc)) {
            System.out.println("descending");
        }
        else System.out.println("mixed");

    }
}

