package 递归迭代;

import java.util.HashSet;
import java.util.Set;

/**
 * @author:胡亚星
 * @createTime 2019-03-09 8:07
 * @description:
 **/
public class 合法括号 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(parenthesis1(15));
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime+"ms");
    }

    public static Set<String> parenthesis(int n) {
        Set<String> s_n = new HashSet<>();
        if (n == 1) {
            s_n.add("()");
            return s_n;
        }
        Set<String> s_n_1 = parenthesis(n - 1);
        for (String eOfN_1 : s_n_1) {
            s_n.add("()" + eOfN_1);
            s_n.add(eOfN_1 + "()");
            s_n.add("(" + eOfN_1 + ")");
        }
        return s_n;
    }

    public static Set<String> parenthesis1(int n) {
        Set<String> res = new HashSet<>();
        res.add("()");
        if (n == 1) {
            return res;
        }

        for (int i = 2; i <= n; i++) {
            Set<String> newRes = new HashSet<>();
            for (String e:res) {
                newRes.add("()" + e);
                newRes.add(e + "()");
                newRes.add("(" + e + ")");
            }
            res = newRes;
        }
        return res;
    }

}
