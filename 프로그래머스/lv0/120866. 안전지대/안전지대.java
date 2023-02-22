class Solution {
    private boolean isSafe(int[][] board, int row, int col) {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int curr_row = row + i;
                int curr_col = col + j;
                if ((curr_row < 0) || (curr_row >= board.length) || (curr_col < 0) || (curr_col >= board.length)) {
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