class Solution {
    public int solution(int slice, int n) {
        //slice : 2 ~ 10조각
        //n : 먹는 사람의 수
        
        int answer = 0;
        
        if(n % slice > 0){
            answer = n / slice + 1;
        }
        else{
            answer = n / slice;
        }
        return answer;
        }
    }