package 递归;

import com.sun.java.swing.plaf.motif.*;

/**
 * @author:胡亚星
 * @createTime 2019-02-14 20:46
 * @description:
 **/
public class 递归 {

    public static void main(String[] args) {
//        System.out.println(f1(new int[]{1,2,3,4,5},0));
//        String str = "1234567891000000";
//        System.out.println(reverse(str,str.length() - 1));
//        System.out.println(f(8));
        System.out.println(gcd(4,2));
    }

    /**
     * 对所有arr元素求和
     * @param arr
     * @param begin
     * @return
     */
    static int f1(int[] arr,int begin){
        if(begin == arr.length - 1){
            return arr[begin];
        }
        return arr[begin] + f1(arr,begin + 1);
    }

    /**
     * 翻转字符串
     * @param str
     * @param end
     * @return
     */
    static String reverse(String str,int end){
        if(end <= 0){
            return str.charAt(0)+"";
        }
        return str.charAt(end)+reverse(str,end - 1);
    }

    //斐波那契
    static int f(int N){
        if(N == 1 || N == 2){
            return 1;
        }
        return f(N-1) + f(N - 2);
    }

    //最大公约数
    static int gcd(int m,int n){
        if(m % n == 0){
            return n;
        }
        return gcd(m,m%n);
    }

    //


}
