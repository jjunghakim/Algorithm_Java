class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //사람 수가 7의 배수
        if (n % 7 ==0)
            answer = n/7;
        else //아닐 경우
            answer = n/7 + 1;
        
        return answer;
    }
}