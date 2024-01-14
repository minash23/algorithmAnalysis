public class commonSubsequence {
    public static void main(String[] args) {
        System.out.println("Inputs: jaao and jalao");
        System.out.println(comSub("jaao", "jalao"));
    }

    public static int comSub(String one, String two) {
        int m = one.length();
        int n = two.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int a = 1; a <= n; a++) {
                if (one.charAt(i - 1) == two.charAt(a - 1)) {
                    dp[i][a] = dp[i - 1][a - 1] + 1;
                } else {
                    dp[i][a] = Math.max(dp[i - 1][a], dp[i][a - 1]);
                }
            }
        }
        return dp[m][n];
    }
}