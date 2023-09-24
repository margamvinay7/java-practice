 import java.util.Scanner;
 class TwoDArray {
    public static void main(String[] args) {
// try (Scanner input = new Scanner(System.in)) {
//     System.out.println("enter row size");
//             int rows = input.nextInt();
//              System.out.println("enter column size");
//             int columns =input.nextInt(); ;
     
            int[][] array = new int[5][5];
     
            int value = 1;
            for (int i = 0; i < array.length; i++) {
                 int[] singleRow=array[i];
                for (int j = 0; j < singleRow.length; j++) {
                    array[i][j] = value;
                    value++;
                     System.out.print(array[i][j] + " ");
                    
                }
                 {System.out.println("");}
            }
}
 
        // System.out.println("The 2D array is: ");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < columns; j++) {
        //         System.out.print(array[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
