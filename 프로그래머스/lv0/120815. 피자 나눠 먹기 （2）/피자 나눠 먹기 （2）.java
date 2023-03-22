class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1; i <= n * 6; i++){
            //판 수 * 6 한 것(총 조각 수)이 인원수로 나누어떨어진다면
            if(i * 6 % n == 0){
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}