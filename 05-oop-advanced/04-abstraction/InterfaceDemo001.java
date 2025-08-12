public class InterfaceDemo001 implements ChildInterface {
    public static void main(String[] args) {
        
    
    }

    @Override
    public void method1() {
        System.out.println("Method1 from ParentInterface01");
    }
    @Override
    public void method2() {
        System.out.println("Method2 from ParentInterface01");
    }
    @Override
    public String method3(String str) {
        System.out.println("Method3 from ParentInterface01 with input: " + str);
        return "Response from method3";
    }


    @Override
    public void method01() {
        System.out.println("Method01 from ParentInterface02");
    }

    @Override
    public void method02() {
        System.out.println("Method02 from ParentInterface02");
    }

    @Override
    public String method03(String str) {
        System.out.println("Method03 from ParentInterface02 with input: " + str);
        return "Response from method03";
    }

    @Override
    public void childMethod1() {
        System.out.println("Child method1 implementation");
    }
    @Override
    public void childMethod2() {
        System.out.println("Child method2 implementation");
    }

}


interface ParentInterface01{

    void method1();
    void method2();
    String method3(String str);

}

interface ParentInterface02{

    void method01();
    void method02();
    String method03(String str);

    public static void staticMethod() {
        System.out.println("Static method in ParentInterface02");
    }

}

interface ChildInterface extends ParentInterface01, ParentInterface02 {

    void childMethod1();
    void childMethod2();
}
