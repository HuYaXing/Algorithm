package 递归迭代;

/**
 * @author:胡亚星
 * @createTime 2019-03-08 21:46
 * @description: 有一个X*Y的网格，每次走只能向右走或者向下走，要从左上角到右下角
 * 设计一个算法，计算有多少种走法
 * X+Y <= 12
 **/
public class 走格子 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(sovle(15, 15));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static int sovle(int x, int y) {
        if (x == 1 || y == 1) return 1;
        return sovle(x - 1, y) + sovle(x, y - 1);
    }

    public static int sovle1(int m, int n) {
        int[][] state = new int[m + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            state[1][i] = 1;
        }
        for (int i = 1; i <= m; i++) {
            state[i][1] = 1;
        }
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                state[i][j] = state[i - 1][j] + state[i][j - 1];
            }
        }
        return state[m][n];
    }
}
