import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"");

        //str값 입력받기 (대문자로)
        String str = st.nextToken().toUpperCase();

        //알파벳 26개 들어가는 배열 alpha 선언
        int[] alpha = new int[26];

        //alpha를 순회하며 str에 해당하는 index에 ++
        for(int i =0; i<str.length(); i++){
            int alphaIndex = str.charAt(i) - 'A'; //A = 65
            alpha[alphaIndex]++;
        }

        //
        int max = -1;
        char ch = '?';

        for(int i =0; i < alpha.length; i++){
            if(alpha[i] > max){
                max = alpha[i];
                ch = (char)(i + 65); //대문자로 출력
            }else if(alpha[i] == max){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}