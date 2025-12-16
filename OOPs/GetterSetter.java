public class GetterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object p1
        p1.setColor("Blue");
     

        System.out.println(p1.getColor());

        
        System.out.println(p1.getTip());
    }
}

class Pen {
    
    // prop + func
   private String color;
   private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

