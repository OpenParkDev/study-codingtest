class Solution {
    private int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, (num1 % num2));
    }
    
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int res_numer = (numer1 * denom2) + (numer2 * denom1);
        int res_denom = denom1 * denom2;
        int gcd = getGCD(res_numer, res_denom);
        int[] answer = {res_numer/gcd, res_denom/gcd};
        return answer;
    }
}