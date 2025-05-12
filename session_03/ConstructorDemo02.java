import java.util.Scanner;

public class ConstructorDemo02{
    

    public int light,fan,ac,tv, laptops, chairs;



    public ConstructorDemo02(){
        light = 10;
        fan = 5;
        ac = 2;
        tv = 1;
        laptops = 2;
        chairs = 5;
        PrintDetails();

    }

    public ConstructorDemo02(int light01, int fan01, int laptops01, int ac01, int tv01, int chairs01)
    {

        this.light = light01;
        this.fan = fan01;
        this.ac = ac01;
        this.tv = tv01;
        this.laptops = laptops01;
        this.chairs = chairs01;
        PrintDetails();



    }

    public void PrintDetails(){
        System.out.println("Light count :" + light);
        System.out.println("Fan count :" + fan);
        System.out.println("AC count :" + ac);
        System.out.println("TV count :" + tv);
        System.out.println("Laptop count :" + laptops);
        System.out.println("Chair count :" + chairs);

    }

    public int getLight(){
        return this.light;
    }


    public static void main(String[] args) {
     
        ConstructorDemo02 cd=new ConstructorDemo02();
        cd.light=101;
        
        System.out.println(cd.getLight());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the count of all the records \nbased on this order \n'Light, Fan, Laptops, ac, tv, chairs'................. ");
        int lg= scanner.nextInt();
        int fn=scanner.nextInt();
        int lpt=scanner.nextInt();
        int ac=scanner.nextInt();
        int tv=scanner.nextInt();
        int chr=scanner.nextInt();
        ConstructorDemo02 cd01=new ConstructorDemo02(lg,fn,lpt,ac,tv,chr);

        System.out.println("********************");
        System.out.println(cd.getLight());
        System.out.println(cd01.getLight());
        // cd.PrintDetails();

    }
}
