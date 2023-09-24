public class Constructor {
    int age=10;
    String name="vinay";
    Constructor( int age,String name){
        this.age=age;
        this.name=name;



    }
    public static void main(String[] args){
        Constructor obj= new Constructor(10,"vinay");
        
        Constructor obj1= new Constructor(10,"vinay");
        Constructor obj2= new Constructor(10,"vinay");
        Constructor obj3= new Constructor(10,"vinay");
        Constructor obj4= new Constructor(10,"vinay");
        Constructor obj5= new Constructor(10,"vinay");
        Constructor obj6= new Constructor(10,"vinay");
        System.out.println(obj3.age+obj3.name);
      
    }
    
}
