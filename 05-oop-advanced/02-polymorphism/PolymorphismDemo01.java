public class PolymorphismDemo01 {
    public static void main(String[] args) {
        // TCS tcs=new TCS();
        // System.out.println("Company Name: " + tcs.getCompanyName());
        // System.out.println("Company Location: " + tcs.getCompanyLocation());
      
      BranchTcsBangalore branchBangalore = new BranchTcsBangalore();
        System.out.println("Parent Company Name: " + branchBangalore.getCompanyName());
        System.out.println("Parent Company Location: " + branchBangalore.getCompanyLocation());
        System.out.println("****************************");
        System.out.println("Methods under child class BranchTcsBangalore:");
        System.out.println("*********************");
        System.out.println("Branch Name: " + branchBangalore.getBranchName());
        System.out.println("Branch Location: " + branchBangalore.getBranchLocation());

        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println("****************************");
        BranchTcsChennai branchChennai = new BranchTcsChennai();
        System.out.println("Branch Name: " + branchChennai.getCompanyName());
        System.out.println("Parent Company Location: " + branchChennai.getCompanyLocation());

    
     }

}



class TCS{
    private String companyName;
    private String companyLocation;

    // this is a default constructor
    // It initializes the companyName and companyLocation with default values
    // This constructor is called when an object of TCS is created without any parameters
    public TCS() {
        this.companyName = "TCS";
        this.companyLocation = "Mumbai, India";
    }

    public String getCompanyName() {
        return companyName;
    }
    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation;
    }
    
}



class BranchTcsChennai extends TCS {
    public BranchTcsChennai() {
        System.out.println("Getting Parent class details");
        System.out.println("Parent NAme :  " + super.getCompanyName());
        System.out.println("Parent Location :  " + super.getCompanyLocation());
        super.setCompanyName( "TCS Chennai Branch");
        super.setCompanyLocation( "Chennai, India");
    }

    @Override
    public String getCompanyName() {
        return super.getCompanyName();
    }
    @Override
    public String getCompanyLocation() {
        return super.getCompanyLocation();
    }


 }


 class BranchTcsBangalore extends TCS{
    private String branchName;
    private String branchLocation;

    public BranchTcsBangalore() {
        this.branchName = "TCS Bangalore";
        this.branchLocation = "Bangalore, India";
    }

    public String getBranchName() {
        return branchName;
    }
    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }
    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }

 }