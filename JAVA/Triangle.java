public class Triangle{
    private static int i;
    private static  int s;
    private static int j;
    private static boolean x=false;
    public Triangle (int i,int s,int j){
        this.i=i;
        this.s=s;
        this.j=j;
    }
    public static boolean pTriangle(){
        if(i>=0 && s>=0 && j>=0 && i+s>j && i+j>s && s+j>i){
            x=true;
        }
        return x;
    }
    public static double getarea(){
        double Area;
        if(pTriangle()==true){
            Area =0.5*(i+s);
        }else{
            Area=0;
        }
        return Area;
    }
