public class Problem1 {
    public static void main(String[] args) {
        int[] arr = {-1,2,1};   
        int target = 2;
        int closestVal = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if(Math.abs(target-closestVal)>Math.abs(target-sum)){
                        closestVal = sum;
                    }
                } 
            }  
        }
        System.out.println(closestVal);     
    }
}
