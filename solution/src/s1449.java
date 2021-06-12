

/**
 * @Author Rookie
 * @Date 2021/6/12
 */
public class s1449 {
    public static void main(String[] args) {
        int[] cost = {4,3,2,5,6,7,2,5,5};
        int target = 9;
        s1449 s = new s1449();
        String res = s.largestNumber(cost,target);
        System.out.println(res);
    }
    public String largestNumber(int[] cost, int target) {
        String[] dp = new String[target+1];
        dp[0] = "";
        for(int i=1;i<10;i++){
            int costs = cost[i-1];
            for(int j=costs;j<=target;j++){
                if(dp[j-costs]!=null){
                    String curr = i+dp[j-costs];
                    if(dp[j]==null){
                        dp[j] = curr;
                    }else{
                        dp[j] = dp[j].length()>curr.length()?dp[j]:curr;
                    }
                }
            }
        }
        return dp[target]==null?"0":dp[target];
    }
}
