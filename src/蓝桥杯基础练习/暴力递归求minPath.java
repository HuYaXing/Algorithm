package 蓝桥杯基础练习;

/**
 * @author:胡亚星
 * @createTime 2019-03-13 14:01
 * @description:
 **/
public class 暴力递归求minPath {
    //纯暴力递归的版本
    public static int minPath(int[][] matrix) {
        //递归函数（从0,0开始，找到达最后需要的最小路径）
        return process(matrix, 0, 0);
    }

    /*
     * 我们要推出从左上到右下的最短代价 那么base应该就是右下角坐标(matrix.length-1, matrix[0].length-1)所对应的代价
     * 这段函数从(0,0)位置进入，
     * 我们先考虑每个点在矩阵中的三种情况
     * case 1:最后一列上,那么我只能向下找路
     * case 2:最后一行上,那么我只能向右找路
     * case 3:是一个普遍位置,那么我可以向右 向下两个方向找路
     */
    public static int process(int[][] matrix, int i, int j) {

        if(i == matrix.length - 1 && j == matrix[0].length - 1){
            return matrix[i][j];
        }

        if (i == matrix.length - 1) {
            return matrix[i][j] + process(matrix, i, j + 1);
        }

        if (j == matrix[0].length - 1) {
            return matrix[i][j] + process(matrix, i + 1, j);
        }

        return matrix[i][j] + Math.min(process(matrix, i + 1, j), process(matrix, i, j + 1));

//        if (i == matrix.length - 1 && j == matrix[0].length - 1) {
//            return matrix[i][j];
//        }
//
//        if (i == matrix.length - 1) {
//            return matrix[i][j] + process(matrix, i, j + 1);
//        }
//
//        if (j == matrix[0].length - 1) {
//            return matrix[i][j] + process(matrix, i + 1, j);
//        }
//
//        return matrix[i][j] + Math.min(process(matrix, i + 1, j), process(matrix, i, j + 1));
    }


    public static void main(String[] args) {
        int[][] m = {{1, 3, 5, 9}, {8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};
        System.out.println(minPath(m));
    }
}

