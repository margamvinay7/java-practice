 class Parent{
    String eat(String name){
        System.out.println("parent class");
        return name;
    }
}
public class OverRiding extends Parent {

     String eat( int age){
        String name="";
        System.out.println("child or main class");
        return name;
    }
    public static void main(String[] args){
        OverRiding obj=new OverRiding();
        obj.eat("chicken");

    }




    
}
