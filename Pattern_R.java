/**
 * The Pattern class prints a square pattern of asterisks with empty spaces in the middle. or square
 */
// public class Pattern {

//     public static void main(String[] args){

//         for(int i=0;i<10;i++){
//             for(int j=0;j<10;j++){
//                 if(j==0|| i==0||i==9||j==9)
//                 System.out.print("* ");
            
//             else{
//                 System.out.print("  ");
//             }
//         }
//             System.out.println("");
//         }
//     }
    
// }

public class Pattern_R{
    public static void main(String[] args){
 for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(j==0|| i==0||i==9||j==9)
                System.out.print("R ");
            
            else{
                System.out.print("  ");
            }
        }
            System.out.println("");
        }
    
    



        for(int i=0;i<10;i++){
            for(int j=0;j<i+1;j++){
                
            if((i+1)>1){
                if(j==0||j==i){
                    System.out.print("R  ");
                }
                else{
                    System.out.print(" ");
                }
            }
            else{
                if(j==0){
                    System.out.print("RR");
                }
                else{
            System.out.print("R ");
                }
            }
           
            }
            System.out.println();
        }
    }
}

