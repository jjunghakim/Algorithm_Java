import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        //br.readLine으로 N 입력 받음
        int N = Integer.parseInt(st.nextToken());
        
        double[] scores = new double[N];
        double M = 0;
        double sum = 0;

        //점수들 입력받아 배열에 넣기
        for(int i = 0; i < scores.length; i++){
            scores[i] = Integer.parseInt(st2.nextToken());
        }

        //배열 길이대로 순회하면서 최댓값 M 찾기
        for(int j = 0; j < scores.length; j++){
            if(scores[j] > M){
                M = scores[j];
            }
        }
        
        //점수 각각 조작 마친 후 sum에 더하기
        for(int t = 0; t < scores.length; t++){
            sum += ((scores[t] / M)*100);
        }

        //평균 구해서 출력 (sum / 과목 수)
        System.out.println(sum / N);
    }
}