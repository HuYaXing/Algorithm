package 递归;

import java.util.Scanner;

/**
 * @author:胡亚星
 * @createTime 2019-02-27 10:44
 * @description:
 **/
public class 小白上楼梯 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            long startTime = System.currentTimeMillis();
            int res = f1(n);
            System.out.println(res);
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);
        }
    }

    private static int f(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return (f(n - 1) + f(n - 2) + f(n - 3));
    }

    private static int f1(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;
        if (n == 3) return 4;
        int x1 = 1;
        int x2 = 2;
        int x3 = 4;
        for (int i = 4; i <= n; i++) {
            int x_1 = x1;
            x1 = x2;
            x2 = x3;
            x3 = ((x1 + x2) + x_1);
        }
        return x3;
    }

}
