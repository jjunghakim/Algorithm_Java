import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        //입력 단어들 배열에 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() { //내가 정렬 기준을 주는 것
            @Override
            public int compare(String s1, String s2) {

                //길이가 같으면 사전 순으로 정렬
                if (s1.length() == s2.length()) {
                    return s1.compareTo(s2); //문자열 비교 : 가장 낮은 아스키코드 차이값을 리턴
                }
                return s1.length() - s2.length(); 
                //length 길이별 정렬
                //양수면 s1이 큰것, 음수면 s2이 큰것 
            }
        });
        System.out.println(arr[0]); //가장 앞에 있는 문자열 출력
        
        //중복 제거
        for (int i = 1; i < N; i++) {
            if (!arr[i].equals(arr[i - 1])) {
                System.out.println(arr[i]);
            }
        }
    }
    }

