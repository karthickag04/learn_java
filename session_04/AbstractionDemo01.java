
abstract class AdminTeam {
    // Abstract method
    public abstract void manageCourse();

    // Concrete method
    // public void logActivity() {
    //     System.out.println("Logging activity in Admin Team.");
    // }
}

abstract class PlacementTeam {
    // Abstract method
    public abstract void managePlacememnt();
}


class Trainer01 extends AdminTeam{

    // Implementing the abstract method
    @Override
    public void manageCourse() {
        System.out.println("Managing course in Trainer01.");
        System.out.println("used to teach with vscode, pycharm etc.");
    }

}
class Trainer02 extends AdminTeam {

    // Implementing the abstract method
    @Override
    public void manageCourse() {
        System.out.println("Managing course in Trainer02.");
        System.out.println("used to teach with online compiler, notepad.");
    }

}



public class AbstractionDemo01{

    public static void main(String[] args) {

        AdminTeam t1=new Trainer01();
        t1.manageCourse();

        AdminTeam t2=new Trainer02();
        t2.manageCourse();
        
      
    }
}