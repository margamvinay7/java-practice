class Inheritance {
    public void in1(){
        int i=1;
        System.out.println(i);
    }
}
class Hello extends Inheritance{
    public void in2(){
        int j=7;
        System.out.println(j);
    }
}
class Vinay extends Hello {
    public void in3(){
        int k=3;
        System.out.println(k);
    }
    public static void main(String[] args){
Vinay obj = new Vinay();
obj.in3();
obj.in2();
obj.in1();
    }
}