package BTU;
import java.util.Scanner;

public class B {
    int a=33;
    double b=9.7;
    String s="#";
    public void print(){
        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a-b);
    }
    public void math(){
        double c=a/b;
    }
    Scanner inpt=new Scanner(System.in);
    public void apply(){
        a=34;
        b=8.7;
        s="*";
        a=inpt.nextInt();
    }
    public void printmr(){
        System.out.println(b+10);
    }
}
