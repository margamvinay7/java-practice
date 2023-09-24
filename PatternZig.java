public class PatternZig {

    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<15;j++){
                if(j<10){
                if(j>5-i)
                System.out.print("* ");
                else{
                    System.out.print("  ");
                }
            }
            else{
                if(j<15-i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
                
            }
            System.out.println();
        }
    }
    
}
