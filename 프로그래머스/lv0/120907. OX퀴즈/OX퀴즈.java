class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] elem = quiz[i].split(" ");
            int first = Integer.parseInt(elem[0]);
            int second = Integer.parseInt(elem[2]);
            int result = Integer.parseInt(elem[4]);
            if (elem[1].equals("+")) {
                if ((first + second) == result) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
            else {
                if ((first - second) == result) {
                    answer[i] = "O";
                }
                else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}