public class Problem2 {
    public static void main(String[] args) {
        System.out.println(totWays("11", 0));
    }
    private static int totWays(String message, int index) {
        if(index>=message.length()){
            return 1;
        }
        int res=0;
        int takeOne = Integer.parseInt(message.substring(index, index+1));
        if(takeOne>=1)
            res+=totWays(message, index+1);
        if(takeOne>=1 && index+2<=message.length()){
            int takeTwo = Integer.parseInt(message.substring(index, index+2));
            if(takeTwo<=26 && takeTwo>=1)
                res+=totWays(message, index+2);
        }
        return res;
    }
}

