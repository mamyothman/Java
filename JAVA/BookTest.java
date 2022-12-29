public class BookTest{
    public static void main(String[] args) {
        Book lm=new Book[20];
        for(int x=0;x<20;x++){
            lm[x]=new Book("mathematic","ISBN","Naa","Hussein");
            lm[x].getBookinfo();
        }
    }
}