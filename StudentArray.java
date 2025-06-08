public class StudentArray {

    public static void main (String[] args){
        Student asmit = new Student(
            "Asmit", 
            "Brt 10", 
            "CSIT", 
            "9808268101");

         Student ankit = new Student(
            "Ankit", 
            "Brt 11", 
            "CSIT", 
            "9808264525");

         Student[] students = new Student[2];
         students[0]= asmit;
         students[1]= ankit;  

         for(int i=0; i<students.length;i++){
            students[i].displayInfo();
            System.out.println("\n");
         }
    }
    
}
