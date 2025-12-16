public class OOPs {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object p1
        p1.setColor("Blue");
        p1.setTip(5);

        System.out.println(p1.color);
        System.out.println(p1.tip);
    }
}




class Pen {
    
    // prop + func
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student {
    String name ;
    int gae ;
    float percentage ;  //cgpa

    void calcPercentage(int phy  , int chem ,int math ){
        percentage = (phy + math + chem)/3;
    }
}