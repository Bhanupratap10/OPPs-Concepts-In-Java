public class Opps_Pen {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created p[en object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);


        BankAccount myAcc = new BankAccount();
        myAcc.username = "BhanuPratap";
        myAcc.setPassword("bhanu123");
    }
}

class BankAccount {
    public String username;
    public String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

   void setTip(int newTip) {
       tip = newTip;
   }
}


class Student {
    String name;
    int age;
    float percentage; // cgpa

    void calcPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math ) / 3;
    }
}
