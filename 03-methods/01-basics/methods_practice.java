public class methods_practice {

    public static void main(String[] args) {
       
        MethodsWorking mw = new MethodsWorking();
        MethodsWorking.addition(33, 22);

        String Result = mw.additionReturn(33,77);
        // System.out.println(mw.additionReturn(33,77));
        System.out.println(Result);

        System.out.println("the result is " + mw.additionReturn01(44,55));

        MethodsWorking.addition(33,33);
        
    }


}


class MethodsWorking{

    public static int addition(int x, int y){
        return  x + y;
    }

    public String additionReturn(int x, int y){
        
        String result = Integer.toString(x + y);
        return "the result is " + result;
    }

    public int additionReturn01(int x, int y){
        
        return  x + y;
    }


}