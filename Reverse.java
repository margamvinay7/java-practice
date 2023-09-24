import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String v=sc.nextLine();
        int l=v.length();
        String reverse="";
        // for(int i=l-1;i>=0;i--){
        //     System.out.print(v.charAt(i));
        // }
        for(int i=1;i<=l;i++){
            reverse=reverse+v.charAt(l-i);
        }
        System.out.println(reverse);
    }

    
}
