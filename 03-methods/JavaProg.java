// this is My first Java program and i named it as JavaProg.java
public class JavaProg {
    // this is main method. it is the entry point of the program
    public static void main(String[] args) {
        
    // JavaProg01 javaProg01=new JavaProg01();
    // javaProg01.printMsg();
    // javaProg01.welcomeMsg();
    // javaProg01.goodBye();
    
    // JavaProg01.printMsg01();
    // JavaProg01.printMsg();
    // JavaProg01.welcomeMsg();
    // JavaProg01.goodBye();
    // msgPrint();
    JavaProg javaProg=new JavaProg();
    long phonnumber=javaProg.returnPhNo();

    if(phonnumber == 9876543222l) {
        System.out.println("Phone number is correct");
    } else {
        System.out.println("Phone number is incorrect .. need to save new number in my");
    }

    javaProg.returnPhNo01(1, 2);


    }


    public static String msgPrint() {
        return "Hello World form main class";
    }
    public  long returnPhNo() {
        return 9876543210l;
    }
    public  void returnPhNo01(int i, int j) {
        System.out.println("Phone number is 9876543210" + i + j);
    }
}