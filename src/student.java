public class student {
    private String stuage;
    private String stuname;
    private String stuID;

    @Override
    public String toString() {
        return "student{" +
                "stuage='" + stuage + '\'' +
                ", stuname='" + stuname + '\'' +
                ", stuID='" + stuID + '\'' +
                '}';
    }

    public student(String name, String age, String ID){
        this.stuname = name;
        this.stuage = age;
        this.stuID = ID;
        
    }
   
    
    
    
    
    
    
    
    
   
 //   public String getStuage( ) {
 //       return this.stuage;
 //   }
  //  public  void  setStuage(String age){
   //     this.stuage = age;
  //  }
    
    
    
}
