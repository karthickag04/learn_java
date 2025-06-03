
abstract class UniversityBDU{

    public String CollegeName;
    public String CollegeLocation;
    
    public abstract void ApplyForCollegeApproval(String CollegeNAme,String CollegeLocation);

    public abstract String getApprovedCollegeName();

    
    
 
}




class BhcCollegeTrichy extends UniversityBDU {


    @Override
    public void ApplyForCollegeApproval(String CollegeNAme, String CollegeName){

        super.CollegeName=CollegeNAme;
    }


    @Override
    public String getApprovedCollegeName(){
        return super.CollegeName;

    }

    

}

class NationalCollegeTrichy extends  UniversityBDU{

    @Override
    public void ApplyForCollegeApproval(String CollegeName, String CollegeLocation){
        super.CollegeName=CollegeName;
    }


     @Override
    public String getApprovedCollegeName(){
        return super.CollegeName;

    }

    

}

public class AbstractDemo02{
    public static void main(String[] args) {


        UniversityBDU member = new BhcCollegeTrichy();
        member.ApplyForCollegeApproval("Bishop Heber College", "Tiruchirappalli");

        System.out.println("Hi "+member.getApprovedCollegeName() +"...! Your application to join under our University has been approved" );

        
        
        System.out.println("********************************************");
        System.out.println("********************************************");
        

        UniversityBDU member02=new NationalCollegeTrichy();
        member02.ApplyForCollegeApproval("National College", "Tiruchirappalli");

        System.out.println("Hi "+member02.getApprovedCollegeName() +"...! Your application to join under our University has been approved");

        
        
        
    }
}