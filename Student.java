public class Student {
    private String fullname;
    private String address;
    private String faculty;
    private String mobile;

    public Student(String fullname,
     String address, 
     String faculty,
     String mobile)
     {
        this.fullname = fullname;
        this.address=address;
        this.faculty = faculty;
        this.mobile = mobile;


     }

     public void displayInfo()
     {
        System.out.println("Fullname:" + fullname);
        System.out.println("Address:" + address);
        System.out.println("Faculty:" + faculty);
        System.out.println("Mobile:" + mobile);
     }  
    
}
