
public class MultidimensionalArrays {

    public static void main(String[] args) {
        int[][] array = new int[5][6];
        int[] x = {1, 2};
        array[0] = x;
        System.out.println(array[0][3]);
    }
    int[][] randomPut(int[][] array)
    {
        for(int row=0;row<array.length;row++)     //不加下标时使用.length求的是行数
            for(int column=0;column<array[row].length;column++)
            {
                int row1=(int)(Math.random()*array.length);
                int column1=(int)(Math.random()*array[row].length);
                int temp=array[row][column];
                array[row][column]=array[row1][column1];
                array[row1][column1]=temp;
            }
        return array;
    }
}


