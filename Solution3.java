import java.util.HashSet;
import java.util.List;

public class Solution3 {
    public int solve(List<String> words) {
        int res = 0;
        int n = words.size();
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(!isShareCommonWord(words.get(i), words.get(j)))
                    res=Math.max(res, words.get(i).length()* words.get(j).length());
            }
        }
        return res;
    }
    public boolean isShareCommonWord(String word1, String word2){
        HashSet<Character> set = new HashSet<>();
        for(char c:word1.toCharArray()){
            set.add(c);
        }
        for(char c:word2.toCharArray()){
            if(set.contains(c))
                return true;
        }
        return false;
    }

}
