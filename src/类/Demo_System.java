package 类;

import java.util.Arrays;

/**
 * @author:胡亚星
 * @createTime 2019-03-03 10:25
 * @description:
 **/
public class Demo_System {

    public static void main(String[] args) {
//        Demo();
        int[] src = {11,22,33,44,55};
        int[] dest = new int[8];
        System.arraycopy(src,0,dest,0,src.length);
        System.out.println(Arrays.toString(dest));
    }

    public static void Demo() {
        for (int i = 0; i < 100; i++) {
            new Demo();
            System.out.println(i);
            System.gc();
        }
    }

}
class Demo {
    @Override
    public void finalize() throws Throwable {
        System.out.println("清扫垃圾");
//        super.finalize();
    }
}