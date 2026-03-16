
class Solution {
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



// third problem 

/*

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

*/


// second problem

/*
int solve(List<Integer> nums, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(); 
       for(int i:nums){
        pq.add(i);
       }
       while(pq.size()>k){
            pq.poll();
       }
       return pq.poll();
    }

*/


