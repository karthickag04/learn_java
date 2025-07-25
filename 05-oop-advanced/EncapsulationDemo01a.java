public class EncapsulationDemo01a {
    public static void main(String[] args) {
        
     TrainingCenter t1 = new TrainingCenter();
     System.out.println("Successfully Opened new Training Center named as " + t1.getCenterName() + " at " + t1.getCenterLocation());

     GtecTrichy t2 = new GtecTrichy();
     System.out.println("Successfully Opened new Training Center named as " + t2.getCenterName() + " at " + t2.getCenterLocation());

    }
    
}




class GtecTrichy extends TrainingCenter {
    

public GtecTrichy() {
    super("GTEC Trichy", "Trichy, Tamilnadu", new String[]{"Java", "Python", "C++"});
  
}

}




class TrainingCenter{
    
private String centerName;
private String centerLocation;

private String[] courseList;

public TrainingCenter() {
    this.centerName = "GTEC";
    this.centerLocation = "Kerala";
    this.courseList = new String[]{"Java", "Python", "C++"};

}

public TrainingCenter(String centerName, String centerLocation, String[] courseList) {
   
    this.centerName = centerName;
    this.centerLocation = centerLocation;
    this.courseList = courseList;

}



public void setCenterName(String centerName) {
    this.centerName = centerName;

}


public String getCenterName() {
     return this.centerName;

}

public void setCenterLocation(String centerLocation) {
    this.centerLocation = centerLocation;

}
public String getCenterLocation() {
     return this.centerLocation;

}
}