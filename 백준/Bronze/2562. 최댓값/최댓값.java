import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //자연수들 담을 배열 선언
        int[] arr = new int[9];

        //배열에 자연수 9개 입력으로 넣어줌
        for(int i = 0; i < 9; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //최댓값, for문 돌 count, 최댓값의 index값 변수 선언
        int max = 0;
        int index = 0;
        int count = 0;

        //value 값으로 arr 탐색
        for(int value : arr){
            //for문 한번 돌때마다 index값(count) 증가
            count++;
            
            //저장한 최댓값보다 다음 value값이 더 크면 max, index값 저장
            if(value > max){
                max = value;
                index = count;
            }
        }
        //최대값 출력
        //몇번째인지도 변수 출력
        System.out.println(max);
        System.out.println(index);
    }
}
