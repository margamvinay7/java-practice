public class OverLoading {
    String eat(String curry){
        
        return curry;

    }
    String eat(String curry,String curry1){
        
        return curry+curry1;

    }
    String eat(String curry,String curry1,String curry2){
        
        return curry+curry1+curry2;

    }

    public static void main(String[] args){

        OverLoading obj =new OverLoading();
       System.out.println("1 argument "+ obj.eat("tamato"));
       System.out.println( "2 argument "+obj.eat("tamato","chicken"));
       System.out.println("3 argument "+ obj.eat("tamato","chicken","mutton"));
       
    }
    
    
}
