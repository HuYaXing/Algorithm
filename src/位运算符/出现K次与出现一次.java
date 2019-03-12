package 位运算符;

/**
 * @author:胡亚星
 * @createTime 2019-02-15 11:42
 * @description:
 **/
public class 出现K次与出现一次 {

    public static void main(String[] args) {
        int[] arr = {2,2,2,123,7,7,7,3,3,3,6,6,6,0,0,0};
        int len = arr.length;
        char[][] kRadix = new char[len][];
        int k = 3;

        int maxLen = 0;
        //转成k进制字符数组
        //对于每个数字
        for (int i = 0; i < arr.length; i++) {
            //求每个数字的三进制字符串并翻转，然后转为字符数组
            kRadix[i] = new StringBuilder(Integer.toString(arr[i],k)).reverse().toString().toCharArray();
            if(kRadix[i].length > maxLen){
                maxLen = kRadix[i].length;
            }
        }

        int[] resArr = new int[maxLen];
        for(int i = 0;i < len;i++){
            //不进位加法
            for(int j = 0;j < maxLen;j++){
                if(j >= kRadix[i].length)
                    resArr[j] += 0;
                else
                    resArr[j] += (kRadix[i][j] - '0');
            }

        }

        int res = 0;
        for(int i = 0;i < maxLen;i++){
            res += (resArr[i] % k) * (int)(Math.pow(k,i));
        }
        System.out.println(res);
    }

}
