public class Email {

    public static void main(String[] args){
    String original="a@gmail.com";
    int n=original.length();
    String username="";
    for(int i=0;i<n;i++){
        if(original.charAt(i)=='@'){
            n=i;
        }else{
username+=original.charAt(i);
        }
    }
    System.out.println(username);
    }
    
}
