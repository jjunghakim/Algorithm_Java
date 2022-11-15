import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        //test Case
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        
        //한줄씩 입력받는 대로 list에 넣고 sort
        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        //sb에 담아서 한꺼번에 출력
        for(int value : list){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
