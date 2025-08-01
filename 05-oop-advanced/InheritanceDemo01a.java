public class InheritanceDemo01a{
    public static void main(String[] args){
        University u1 = new University();
        System.out.println("Successfully Opened new University named as " + u1.getUniversityName() + " at " + u1.getUniversityLocation() + " with courses: " + String.join(", ", u1.getCourseList()));

        // parameterised constructor for university
        University u2 = new University("Anna University", "Chennai, Tamilnadu", new String[]{"B.E", "M.E", "B.Tech", "M.Tech", "MBA", "MBA (Part-Time)", "Ph.D"});
        
        System.out.println("Now, we will join under a specific college...");
        System.out.println("******************************************");
        
        System.out.println("******************************************");


        BhcCollege c1 = new BhcCollege();

        System.out.println("Successfully joined under " + c1.getUniversityName()  + " at " + c1.getUniversityLocation() + " with courses: " + String.join(", ", c1.getCourseList()));
        // parameterised constructor for college

        
        BhcCollege c2 = new BhcCollege("Bishop Heber College", "Trichy, Tamilnadu", new String[]{"B.Sc", "M.Sc", "MBA", "B.Com"});
        
        System.out.println("Successfully joined under " + c2.getCollegeName() + " at " + c2.getCollegeLocation() + " with courses: " + String.join(", ", c2.getCourseList()) + "With University: " + c2.getUniversityName() + " at " + c2.getUniversityLocation());



        System.out.println("Now, we will join under a specific department...");
        System.out.println("******************************************");

        Department d1 = new Department();
        System.out.println("Successfully create a new Department under " + d1.getCollegeName() +" at " + d1.getCollegeLocation() + " with courses: " + String.join(", ", d1.getCourseList()) + " With University: " + d1.getUniversityName() + " at " + d1.getUniversityLocation());
    }

}
// this is parent

class University{
    private String universityName;
    private String universityLocation;
    private String[] courseList;

    public University() {
        this.universityName = "Bharathidasan University";
        this.universityLocation = "Tamilnadu";
        this.courseList = new String[]{"B.Sc", "M.Sc", "B.Tech", "M.Tech"};
    }
    public University(String universityName, String universityLocation, String[] courseList) {
        this.universityName = universityName;
        this.universityLocation = universityLocation;
        this.courseList = courseList;
    }

    public String getUniversityName() {
        return universityName;
    }

    public String getUniversityLocation() {
        return universityLocation;
    }
    public String[] getCourseList() {
        return courseList;
    }

}


// This is child class of University
class BhcCollege extends University{
    private String collegeName;
    private String collegeLocation;
    private String[] courseList;

    public BhcCollege() {
        super(); // Call the constructor of the parent class University
        this.collegeName = "Bishop Heber College";
        this.collegeLocation = "Trichy, Tamilnadu";
        this.courseList = new String[]{"B.Sc", "M.Sc",  "MBA"};
    }
    public BhcCollege(String collegeName, String collegeLocation, String[] courseList) {
        
        this.collegeName = collegeName;
        this.collegeLocation = collegeLocation;
        this.courseList = courseList;
    }

    public String getCollegeName() {
        return collegeName;
    }
    public String getCollegeLocation() {
        return collegeLocation;
    }
    public String[] getCourseList() {
        return courseList;
    }

}


// This is child class of BhcCollege
class Department extends BhcCollege{

}





 {
    
}
