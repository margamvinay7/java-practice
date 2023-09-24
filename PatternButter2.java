public class PatternButter2 {

    public static void main(String[] args){
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                if(j<=i||j>=9-i)
                System.out.print("*");
            
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<10;j++){
                if(j<5-i||j>=5+i)
                System.out.print("*");
            
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
    
}
