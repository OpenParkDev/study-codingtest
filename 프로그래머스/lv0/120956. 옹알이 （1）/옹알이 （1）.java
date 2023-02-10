import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        Set<String> babble = new HashSet<>();
        babble.add("aya");
        babble.add("ye");
        babble.add("woo");
        babble.add("ma");
        
        for (String word : babbling) {
            String str = "";
            for (int i = 0; i < word.length(); i++) {
                String c = Character.toString(word.charAt(i));
                str += (String) c;
                if (str.length() == 2) {
                    if (babble.contains(str)) {
                        str = "";
                    }
                }
                else if (str.length() == 3) {
                    if (babble.contains(str)) {
                        str = "";
                    }
                    else {
                        break;
                    }
                }
                
                if (i == word.length()-1 && str.equals("")) {
                    answer++;
                }
            }
        }
        
        return answer;
    }
}