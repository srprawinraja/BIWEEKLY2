
/*
Given three strings s1, s2, and s3, return true if s3 is formed by interleaving s1 and s2; otherwise, return false.
Interleaving means splitting s1 and s2 into substrings:

s1 = s1_1 + s1_2 + ... + s1_n
s2 = s2_1 + s2_2 + ... + s2_m
such that:

|n - m| <= 1
The concatenation is alternating, starting from either string:
s1_1 + s2_1 + s1_2 + s2_2 + ... or
s2_1 + s1_1 + s2_2 + s1_2 + ...
Examples
Example 1
Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
Output: true
Example 2
Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
Output: false
Example 3
Input: s1 = "", s2 = "", s3 = ""
Output: true
Constraints
0 <= s1.length, s2.length <= 100
0 <= s3.length <= 200
s1, s2, and s3 contain lowercase English letters.
Follow-up
Could you solve it using only O(s2.length) additional space?


*/
class Solution1 {
    public boolean isInterleave(String s1, String s2, String s3) {
        return isPossible(0, 0, 0, s1, s2, s3);   
    }
    public boolean isPossible(int index, int index1, int index2, String s1, String s2, String s3){
        if(index>=s3.length() && index1>=s1.length() && index2>=s2.length()){
            return true;
        }
        if(index>=s3.length() || index1>=s1.length() && index2>=s2.length()){
            return false;
        }
   

        boolean res=false;
        if(index1<s1.length() && s3.charAt(index)==s1.charAt(index1)){
            res = res || isPossible(index+1, index1+1, index2, s1, s2, s3);   
        }
        if(index2<s2.length() && s3.charAt(index)==s2.charAt(index2)){
            res = res || isPossible(index+1, index1, index2+1, s1, s2, s3);  
        } 
        
        return res;
    }
}