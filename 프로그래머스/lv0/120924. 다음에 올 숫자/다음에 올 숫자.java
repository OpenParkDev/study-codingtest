class Solution {
    public int solution(int[] common) {
        int first = common[0];
        int second = common[1];
        int third = common[2];
        int last = common[common.length-1];
        
        int answer = 0;
        
        if ((second-first) == (third-second)) {
            answer = last + (third-second);
        }
        else {
            answer = last * (third/second);
        }
        
        return answer;
    }
}