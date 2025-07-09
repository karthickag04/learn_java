interface AdminTeam {
    // Abstract method (implicitly public and abstract)
    void manageCourse();
}
interface PlacementTeam {
    // Abstract method (implicitly public and abstract)
    void managePlacememnt();
    void managePlacememnt01();
}





class Trainer01 implements AdminTeam, PlacementTeam {

    @Override
    public void manageCourse() {
        System.out.println("Managing course in Trainer01.");
        System.out.println("used to teach with vscode, pycharm etc.");
    }

    @Override
    public void managePlacememnt() {
        System.out.println("Managing placement in Trainer01.");
    }

    @Override
    public void managePlacememnt01() {
        System.out.println("Managing placement 01 in Trainer01.");
    }
}

class Trainer02 implements AdminTeam {

    @Override
    public void manageCourse() {
        System.out.println("Managing course in Trainer02.");
        System.out.println("used to teach with online compiler, notepad.");
    }
}

public class AbstractionUsingInterface01 {

    public static void main(String[] args) {

        AdminTeam t1 = new Trainer01();
        t1.manageCourse();
        

        AdminTeam t2 = new Trainer02();
        t2.manageCourse();
    }
}
