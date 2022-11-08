import java.util.*;
class ravi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float s=0;
        s=(float)(a+b+c)/2;
        float e=0;
        e=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("%.2f",e);
    }
}