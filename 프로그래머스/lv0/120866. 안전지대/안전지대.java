class Solution {
    private boolean isSafe(int[][] board, int row, int col) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int curr_row = row - 1 + i;
                int curr_col = col - 1 + j;
                if ((curr_row < 0) || (curr_row >= board.length)) {
                    continue;
                }
                else if ((curr_col < 0) || (curr_col >= board.length)) {
                    continue;
                }
                
                if (board[curr_row][curr_col] == 1) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public int solution(int[][] board) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (isSafe(board, i, j)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}