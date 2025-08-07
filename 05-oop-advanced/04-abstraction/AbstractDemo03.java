import java.text.SimpleDateFormat;
import java.util.Date;

abstract class UniversityBDU{

    public String CollegeName;
    public String CollegeLocation;
    private Date YearOfJoining;
    
    public abstract void ApplyForCollegeApproval(String CollegeNAme,String CollegeLocation);

    public abstract String getApprovedCollegeName();

    public abstract void setYearOFJoining(Date YearOfJoining);

    public void setYear(Date year){
        this.YearOfJoining=year;
    }

    public Date getJoiningYear(){
        return this.YearOfJoining;
    }
 
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

    @Override
    public void setYearOFJoining(Date YearOfJoining){
        // super.YearOfJoining=YearOfJoining;
        super.setYear(YearOfJoining);
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

    @Override
    public void setYearOFJoining(Date YearOfJoining){
        // super.YearOfJoining=YearOfJoining;
        super.setYear(YearOfJoining);
    }

}

public class AbstractDemo03{
    public static void main(String[] args) {


        UniversityBDU member = new BhcCollegeTrichy();
        member.ApplyForCollegeApproval("Bishop Heber College", "Tiruchirappalli");

        System.out.println("Hi "+member.getApprovedCollegeName() +"...! Your application to join under our University has been approved" );

        
        
        System.out.println("********************************************");

        member.setYearOFJoining(new Date());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        try
        {
        member.setYearOFJoining(sdf.parse("2000-12-12"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Hi "+member.getApprovedCollegeName() +"...! Your application to join under our University has been approved" + "  and your membership will be starting from .."  + member.getJoiningYear());



        System.out.println("********************************************");
        System.out.println("********************************************");
        System.out.println("********************************************");


        UniversityBDU member02=new NationalCollegeTrichy();
        member02.ApplyForCollegeApproval("National College", "Tiruchirappalli");

        System.out.println("Hi "+member02.getApprovedCollegeName() +"...! Your application to join under our University has been approved");

        System.out.println("********************************************");

        member.setYearOFJoining(new Date());
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        
        try
        {
        member.setYearOFJoining(sdf1.parse("2000-12-12"));
        }
        catch (Exception e) {
            e.printStackTrace();
        }

       
        System.out.println("Hi "+member.getApprovedCollegeName() +"...! Your application to join under our University has been approved" + "  and your membership will be starting from .."  + member02.getJoiningYear());

        
    }
}