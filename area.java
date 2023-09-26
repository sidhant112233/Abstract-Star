import java.util.Scanner;
public class area{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.read();
        r.show();
        cicle c = new cicle();
        c.read();
        c.show();
            
        
    }
}
abstract class shap{
   
    final float pi = 3.14f;
     int l,b,area;
    Scanner scan = new Scanner(System.in);
    
    
    abstract void read();
    abstract void show();
}


class Rectangle extends shap{
    void read(){
        System.out.print("Enter l = ");
        l = scan.nextInt();
        System.out.print("Enter b = ");
        b = scan.nextInt();
        
        area = l*b;

    }
    void show(){
        System.out.println("arae  = "+area);

    }   
}  
class cicle extends shap{
   float r,total;
    void read(){
        System.out.print("Enter r = ");
        r = scan.nextFloat();
        total = pi * r *r ;


    }
    void show(){
        System.out.println("area = "+total);
    }
}