package 递归迭代;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author:胡亚星
 * @createTime 2019-03-09 9:32
 * @description:
 **/
public class 非空子集 {
    public static void main(String[] args) {
        String[] A = {"A", "B", "C"};
//        Set<Set<String>> subsets = getSubsets2(A, A.length);
        ArrayList<ArrayList<String>> subsets = getSubsets(A, A.length);
        subsets.remove(new HashSet<>());
        System.out.println(subsets);
    }

    /**
     * 递归解法
     *
     * @param A
     * @param n
     * @return
     */
    public static Set<Set<String>> getSubsets3(String[] A, int n) {
        Arrays.sort(A);
        return getSubsets3Core(A, n - 1);
    }

    public static Set<Set<String>> getSubsets3Core(String[] A, int cur) {
        Set<Set<String>> newSet = new HashSet<>();
        if (cur == 0) {//处理第一个元素
            Set<String> nil = new HashSet<>();
            Set<String> first = new HashSet<>();
            first.add(A[0]);
            newSet.add(nil);
            newSet.add(first);
            return newSet;
        }

        Set<Set<String>> oldSet = getSubsets3Core(A, cur - 1);
        for (Set<String> set : oldSet) {
            //对于每个子集，cur这个元素可以加进去，也可以不加
            newSet.add(set);//保留原样
            //不能对set改变，所以clone
            Set<String> clone = (Set<String>) ((HashSet) set).clone();
            clone.add(A[cur]);
            newSet.add(clone);
        }
        return newSet;
    }

    /*逐步生成迭代*/
    public static Set<Set<String>> getSubsets2(String[] A, int n) {
        Set<Set<String>> res = new HashSet<>();
        res.add(new HashSet<>());//初始化为空集

        //从第一个元素开始
        for (int i = 0; i < n; i++) {
            Set<Set<String>> new_res = new HashSet<>();
            new_res.addAll(res);//将原集合的所有元素添加到
            for (Set set : res) {
                Set clone = (Set) ((HashSet) set).clone();
                clone.add(A[i]);
                new_res.add(clone);
            }
            res = new_res;
        }
        return res;
    }

    /*二进制解法*/
    public static ArrayList<ArrayList<String>> getSubsets(String[] A, int n) {
        Arrays.sort(A);
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        for (int i = (int) (Math.pow(2, n) - 1); i > 0; i--) {
            ArrayList<String> s = new ArrayList<>();
            for (int j = n - 1; j >= 0; j--) {
                if (((i >> j) & 1) == 1) {//二进制最后一位是不是1
                    s.add(A[j]);
                }
            }
            res.add(s);
        }
        return res;
    }

}
