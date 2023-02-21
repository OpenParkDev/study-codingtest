class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        for (int i = 0; i < quiz.length; i++) {
            String[] elem = quiz[i].split(" ");
            int input1 = Integer.parseInt(elem[0]);
            int input2 = Integer.parseInt(elem[2]);
            int output = Integer.parseInt(elem[4]);
            
            int real = (elem[1].equals("+")) ? (input1 + input2) : (input1 - input2);
            String result = (real == output) ? "O" : "X";
            answer[i] = result;
        }
        return answer;
    }
}