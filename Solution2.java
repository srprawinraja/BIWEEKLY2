import java.util.List;
import java.util.PriorityQueue;

public class Solution2 {
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
}
