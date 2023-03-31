class Solution {
    public double solution(int[] numbers) {
        double sum = 0; //합한 값
        
        //반복문으로 배열 처음부터 끝까지 탐색하면서 더하기
        for(int i = 0; i < numbers.length; i++){
          sum += numbers[i];
        }
        
        //배열 길이로 나누기
        return sum / numbers.length;
    }
}