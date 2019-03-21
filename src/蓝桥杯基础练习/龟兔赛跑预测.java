package 蓝桥杯基础练习;

import java.util.Scanner;

/**
 * @author:胡亚星
 * @createTime 2019-03-12 21:23
 * @description:
 **/
public class 龟兔赛跑预测 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //j1,j2分别为兔子乌龟已跑的路程
        int v1, v2, t, s, l, j1 = 0, j2 = 0, i = 0;
        v1 = sc.nextInt();//兔子
        v2 = sc.nextInt();//乌龟
        t = sc.nextInt();//超过t米
        s = sc.nextInt();//休息s秒
        l = sc.nextInt();//长度

        while (j1 < l && j2 < l) {
            j1 += v1;
            j2 += v2;

            i++;//过去了1秒

            if (j1 == l || j2 == l) {
                break;
            }
            if (j1 - j2 >= t) {//如果兔子领先t米，就要等乌龟s秒，乌龟多跑v2*s米，同时记录好时间
                j2 = j2 + v2 * s;
                i = i + s;
            }

        }

        if (j1 > j2) {
            System.out.println("R");
            System.out.println(i);//不能用v1（有可能兔子中间有等待的过程）
        } else if (j1 < j2) {
            System.out.println("T");
            System.out.println(i);//不能用i(有可能兔子在等待的时候就到达了终点)
        } else {
            System.out.println("D");
            System.out.println(l / v2);
        }
    }
}
