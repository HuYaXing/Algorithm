package 位运算符;

import java.util.Scanner;

/**
 * @author:胡亚星
 * @createTime 2019-02-13 21:44
 * @description:
 **/
public class 二进制一的个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        //进制转化
        System.out.println(Integer.toString(N, 2));

        int count = 0;
        //比对每一位
        for (int i = 0; i < 32; i++) {
            //只有对应位是1时，才会保留与（1<<i）相等
            if ((N & (1 << i)) == (1 << i)) {
                count++;
            }
        }
        System.out.println(count);

        //法二
        count = 0;
        for (int i = 0; i < 32; i++) {
            //由低位向高位判断
            if (((N >>> i) & 1) == 1) {
                count++;
            }
        }
        System.out.println(count);

        //法三
        count = 0;
        while (N != 0) {
            N = (N - 1) & N;
            count++;
        }
        System.out.println(count);

    }
}
