
public class Rectangle {
    private double width;
    private  double length; 

    public Rectangle() {
        length = 2.5;
        width = 3.5;
   }
   public Rectangle(double length, double width){
       this.length = length;
       this.width = width;
   }
   public double getArea() {
       return length * width;
   }
   public double getPerimeter() {
       return 2 * (length + width);
   }
   public static void main (String[]args){
       Rectangle  rec= new Rectangle();
       System.out.println(rec. getArea());
       System.out.println(rec. getPerimeter());

       Rectangle  rec2= new Rectangle(3.0,2.0);
       System.out.println(rec. getArea());
       System.out.println(rec. getPerimeter()); 


   }
}