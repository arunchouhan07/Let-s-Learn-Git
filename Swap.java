public class Swap{
    public static void main(String args[])
    {
        int a=10;
        int b=20;

        System.out.println("Numbers Before Swap "+a+" "+b);
        a=a+b; //a=10+20 =30;
        b=a-b; //b=30-20 =10;
        a=a-b; //a=30-10 =20;
        
        System.out.printf("Numbers After Swap "+a+" "+b);
    }
}