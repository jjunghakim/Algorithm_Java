class Solution {
    public int[] solution(int n) {
        //반복문 돌려서 홀수만 배열에 넣기
        int k = 0;
        int[] answer;
        
        //배열 크기
        if(n % 2 == 0){
            answer = new int[n/2];
        }else{
            answer = new int[n/2 + 1];
        }
        
        for(int i = 0; i <= n; i++){
            if(i % 2 == 1){
                answer[k] = i;
                k++;
            }
        }
        return answer;
    }
}