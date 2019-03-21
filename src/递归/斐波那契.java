package 递归;

/**
 * @author:胡亚星
 * @createTime 2019-03-15 20:13
 * @description:
 **/
public class 斐波那契 {

    public static void main(String[] args) {
        long start_time = System.currentTimeMillis();
        System.out.println(f(40));
        long end_time = System.currentTimeMillis();
        System.out.println(end_time - start_time + "ms");
    }

    static int f(int N) {
        int res = 0;
        int f_1 = 1;
        int f_2 = 1;

        for (int i = 3; i <= N; i++) {
            res = f_1 + f_2;
            f_1 = f_2;
            f_2 = res;
        }
        return res;
    }


    /*递归*/
    static int f1(int N) {
        if(N == 1 || N == 2){
            return 1;
        }
        return f1(N - 1) + f1(N - 2);
    }


}
