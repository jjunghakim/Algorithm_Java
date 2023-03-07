import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array);
        
        int middle = (array.length + 1) / 2;
        
        int answer = array[middle - 1];
        
        return answer;
    }
}