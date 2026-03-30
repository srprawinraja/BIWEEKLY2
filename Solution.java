
import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public static void main(String[] args) {
        // first problem
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.isInterleave("aabcc", "dbbca","aadbbcbcac"));
        
        // second problem
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solve(new ArrayList<>(Arrays.asList(1,1,1,2,2,3))));

        // third problem
        Solution3 solution3 = new Solution3();
        ArrayList<ArrayList<Integer>> inp = new ArrayList<>();
        inp.add(new ArrayList<>(Arrays.asList(11, 2, 4)));
        inp.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        inp.add(new ArrayList<>(Arrays.asList(10, 8, -12)));
        System.out.println(solution3.solve(inp));
        

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


