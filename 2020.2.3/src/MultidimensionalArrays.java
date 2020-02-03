
public class MultidimensionalArrays {

    public static void main(String[] args) {
        int[][] array = new int[5][6];
        array=RandomInitArrays(5,6);
        Print2DArrays(array);
        array=randomPut(array);
        Print2DArrays(array);


    }
    static int[][] randomPut(int[][] array)
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
    static int[][] RandomInitArrays(int row,int column)
    {
        int[][]array = new int[row][column];
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                array[i][j]=(int)(Math.random()*100);
            }
        }
        return array;
    }
    static void Print2DArrays(int[][] array)
    {
        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }

        }
        System.out.println("");
    }

}


