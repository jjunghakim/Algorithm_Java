class Solution {
    public int solution(int[] array) {
        int[] countArray = new int[1001];
        //인덱스값에 해당 숫자 몇번 저장되었는지 저장하는 countArray
        for(int i = 0; i < array.length; i++){
            countArray[array[i]]++;
        }
        
        //countArray의 최댓값 구하기
        int max = 0;
        int answer = 0;
        
        for(int i = 0; i < countArray.length; i++){
            if (countArray[i] > max){
                max = countArray[i];
                //max의 index에 해당하는 것이 최빈값
                answer = i;
            }
        }
        //최빈값 여러개일 경우
        int temp = 0;
        for(int i = 0; i < countArray.length; i++){
            if (countArray[i] == max) temp++;
            if (temp > 1) return -1;
        }
        return answer;
    }
}