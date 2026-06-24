public class SingleInherit01 {
    public static void main(String[] args){
        Child child = new Child();
        System.out.println("Assets: " + child.getAssets());
        System.out.println("Location: " + child.getLocation());


    }
    
}


class GrandParent {
  private String assets = "House from Grandfather";
  private String location = "Trichy is the location of the Grandfather's house";
  public String getAssets() {
    return assets;
  }
  public String getLocation() {
    return location;
  }


  public void setAssets(String assets) {
    this.assets = assets;
  }
  public void setLocation(String location) {
    this.location = location;
  }
}
class Parent extends GrandParent {


    

    public void getParentAssets() {
        System.out.println("Assets from Parent: " + getAssets());
    }

    public void setParentAssets(String assets) {
        super.setAssets(assets);
    }

}

class Child extends Parent {
}