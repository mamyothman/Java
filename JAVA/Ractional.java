public class Rational {
    private int num;
    private int deno;
    public Rational(int num, int deno){
        this.num = num;
        this.deno = deno;
    }
    public String AddRational(Rational A1,Rational A2){
        num = A1.num + A2.num;
        deno = A1.deno + A2.deno;
        return num +" + "+deno;
    }
    public String SubRational(Rational A1,Rational A2){
        num = A1.num - A2.num;
        deno = A1.deno - A2.deno;
        return num +" - "+deno;
    }
    public String MultRational(Rational A1,Rational A2){
        num = A1.num * A2.num;
        deno = A1.deno * A2.deno;
        return num +" * "+deno;
    }
    public String DivRational(Rational A1,Rational A2){
        num = A1.num / A2.num;
        deno = A1.deno / A2.deno;
        return num +" / "+deno;
    }
    public void printRational(Rational A1,Rational A2){
        System.out.println("for adding "+AddRational(A1, A2));
        System.out.println("for substracting "+SubRational(A1, A2));
        System.out.println("for multiplying "+MultRational(A1, A2));
        System.out.println("for dividing "+DivRational(A1, A2));
    }
}