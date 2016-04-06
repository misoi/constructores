
package constructor;

public class Constructor {
    int wheels;
    int doors;
    int seats;
    String transmission;
    String color;
    public Constructor(int w,int d,int s, String t,String c){
        this.wheels=w;
        this.doors=d;
        this.seats=s;
       this.transmission=t;
        this.color=c;
    }
    public static void main(String[] args) {
       Constructor bmw=new Constructor(4,1,45,"manual","blue");
       
    }
    
}
