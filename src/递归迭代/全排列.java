package 递归迭代;

import java.util.ArrayList;

/**
 * @author:胡亚星
 * @createTime 2019-03-11 10:07
 * @description:
 **/
public class 全排列 {

    public static void main(String[] args) {
        System.out.println(getPermutation("ABCD", 4));

//        String s = "123";
//        permutation("",s.toCharArray());

    }

    /*逐步生成大法*/
    public static ArrayList<String> getPermutation0(String A) {
        int n = A.length();
        ArrayList<String> res = new ArrayList<>();
        res.add(A.charAt(0) + "");//初始化，包含第一个字符

        for (int i = 1; i < n; i++) {//第二个字符插入到每个元素里面
            ArrayList<String> res_new = new ArrayList<>();
            char c = A.charAt(i);//新字符
            for (String str : res) {//访问上一次集合中的每一个元素
                //插入到每一个位置
                String newStr = c + str;//加在前面
                res_new.add(newStr);
                newStr = str + c;//加在后面
                res_new.add(newStr);

                for (int j = 1; j < str.length(); j++) {
                    newStr = str.substring(0, j) + c + str.substring(j);
                    res_new.add(newStr);
                }
            }
            res = res_new;
        }
        return res;
    }

    /*递归*/
    public static ArrayList<String> getPermutation(String A, int N) {
        if (N == 1) {
            ArrayList<String> res = new ArrayList<>();
            res.add(A.charAt(0) + "");
            return res;
        }
        ArrayList<String> list = getPermutation(A, N - 1);//前N-1项
        char c = A.charAt(N - 1);
        ArrayList<String> res_new = new ArrayList<>();
        for (String str : list) {//访问上一次集合中的每一个元素
            //插入到每一个位置
            String newStr = c + str;//加在前面
            res_new.add(newStr);
            newStr = str + c;//加在后面
            res_new.add(newStr);

            for (int j = 1; j < str.length(); j++) {
                newStr = str.substring(0, j) + c + str.substring(j);
                res_new.add(newStr);
            }

        }
        return res_new;
    }

    final static int k = 3;
    static int count = 0;

    /*字典序的第K个元素*/
    public static void permutation(String prefix, char[] arr) {
        if (prefix.length() == arr.length) {//前缀的长度等于字符集的长度，一个排列完成
            count++;
            if (count == k) {
                System.out.println("---" + prefix);
                System.exit(0);
            }
        }

        //每次都从头扫描，只要该字符可用，我们就附加到前缀后面，前缀变长了
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            //这个字符可用：在pre中出现的次数<在数组中出现的次数
            if (count(prefix, ch) < count(arr, ch)) {
                permutation(prefix + ch, arr);
            }
        }
    }

    static int count(char[] arr, char ch) {
        int cnt = 0;
        for (char c : arr) {
            if (c == ch) cnt++;
        }
        return cnt;
    }

    static int count(String prefix, char ch) {
        int cnt = 0;
        for (int i = 0; i < prefix.length(); i++) {
            if (prefix.charAt(i) == ch) cnt++;
        }
        return cnt;
    }
}
