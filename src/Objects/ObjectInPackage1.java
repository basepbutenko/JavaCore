package Objects;

public class ObjectInPackage1 {
    public String item1="public";// public
    String item2 = "package"; // package
    protected String item3="protected";//protected
    private String item4="privat"; // privat
    private String run = "I can Run";

    public ObjectInPackage1(){

    }
   public ObjectInPackage1(String item1, String item2, String item3, String item4, String run){
       this.item1=item1;
       this.item2 = item2;
       this.item3 = item3;
       this.item4 = item4;
       this.run=run;

    }

    public String getItem4(){
       return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }


    public String getRun(){
        return run;
    }
}
