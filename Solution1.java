public class Solution1 {
    public static int solve(String word1, String word2) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<word1.length(); i++){
            int match=0;
            int j = i;
            int k = i;
            for(; j<word2.length(); j++){
                if(word1.charAt(k)==word2.charAt(j)){
                    match++;    
                    k++; 
                } else break;  
            }
            if(j==word2.length()){
                System.out.println(match+" "+i+" "+j);
                min=Math.min(min, word2.length()-match);
            }
            
        }
        return min;
    }
}
