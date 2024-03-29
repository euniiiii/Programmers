import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] dp = new int[k + 1];
        dp[0] = 1;

        for (int i=1; i<=n; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j=num; j<=k; j++) {
                dp[j] += dp[j-num];
            }
        }
        System.out.println(dp[k]);
    }

}