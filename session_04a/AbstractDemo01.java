
abstract class University{

    public String CollegeName;
    public String CollegeLocation;
    
    public abstract void ApplyForCollegeApproval(String CollegeNAme,String CollegeLocation);

    public abstract String getApprovedCollegeName();

}


class BhcCollegeTrichy extends University {


    @Override
    public void ApplyForCollegeApproval(String CollegeNAme, String CollegeName){

        super.CollegeName=CollegeNAme;
    }

    @Override
    public String getApprovedCollegeName(){
        return super.CollegeName;

    }

    

}


public class AbstractDemo01{
    public static void main(String[] args) {


        University member = new BhcCollegeTrichy();
        member.ApplyForCollegeApproval("Bishop Heber College", "Tiruchirappalli");

        System.out.println("Hi "+member.getApprovedCollegeName() +"...! Your application to join under our University has been approved" );

    }
}