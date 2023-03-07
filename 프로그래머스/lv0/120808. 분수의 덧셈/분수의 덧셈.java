class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        //분수합 값 구하기
        int boonmo = denom1 * denom2;
        int boonja = (numer1 * denom2) + (numer2 * denom1);
        
        //최대공약수 구하기
        int maxgys = gcd(boonmo, boonja);
        
        //분자, 분모를 최대공약수로 나눈
        //정답 배열에 담기
        int[] answer = {boonja / maxgys, boonmo / maxgys};
        
        return answer;
    }
    
    // 최대공약수 구하는 코드
    public static int gcd (int a, int b){
        if(a <= b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b == 0) return a;
        
        //재귀로 계속 나눔
        return gcd(b, (a%b));
    }
}