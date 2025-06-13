public class Constructor {
    public static void main(String args[]) {
       Student s1 = new Student();
       Student s2 = new Student("Bhanu");
       Student s3 = new Student(1223);
        
    }
}

class Student {
    String name;
    int roll;

   Student() {
    System.out.println("constructor is called..."); //non Paramaterized
   }

    Student(String name) {   // Paramaterized
        this.name= name; 
    }

    Student(int roll) {    // constructor
        this.roll = roll;
    }
}
