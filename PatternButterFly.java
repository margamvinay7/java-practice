public class PatternButterFly {
    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                if(j<=i||j>=9-i){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                if(j<5-i||j>=5+i){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //  for(int i=5;i>0;i--){
        //      for(int j=0;j<10;j++){
        //         if(true){
        //   System.out.print("*");
        //   }
        //   else{
        //       System.out.print(" ");
        //   }
        //      }
        //      System.out.println();
        //  }
    }
    
}




// public class PatternButterFly {
//     public static void main(String[] args){
//         for(int i=0;i<20;i++){
//             for(int j=0;j<20;j++){
//                 if(j==0||j==(0+i)||j==19||j==(19-i)){
//                 System.out.print("* ");
//                 }
//                 else{
//                     System.out.print("  ");
//                 }
//             }
//             System.out.println();
//         }
        
//     }
    
// }
