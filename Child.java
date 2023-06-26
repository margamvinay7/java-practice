





class Child {

    String name;
    int grade;

    Child(String n,int g){
        name=n;
        grade=g;
    }
    public void getCall(){
        System.out.println("in child");
    }

    void methodOverload1(){
       
        System.out.println("in child");
    }
   
    public static void main(String[] args){
        Child obj=new Child("vinay",97);
        
        System.out.println(obj.name+"his marks :"+obj.grade);
        Child obj1=new Child("mani",98);
        System.out.println(obj1.name+"his marks :"+obj1.grade);
    }
}
 