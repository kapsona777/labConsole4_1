package BTU;
import java.util.Scanner;

public class C {
    int a=10;
    int b=9;
    String s="#";
    String h="@";
    int c=a+b;
    int d=a*b;
    int e=a-b;
    int f=a%b;

    public void print(){
        System.out.println(a+" and "+b);
        System.out.println(s+" and "+h);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    Scanner inpt=new Scanner(System.in);
    public void apply(){
        a=inpt.nextInt();
        b=inpt.nextInt();
        s=inpt.nextLine();
        h=inpt.nextLine();
    }
}
