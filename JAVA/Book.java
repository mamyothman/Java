public class Book{
    private String bname;
    private String isbn;
    private String author;
    private String publisher;
    public Book(String bname,String isbn,String author, String publisher){
        this.bname=bname;
        this.isbn=isbn;
        this.author=author;
        this.publisher=publisher;

    }public void setbname(String bname){
        this.bname=bname;
    }
    public String getbname(){
        return bname;
    }public void setisbn(String isbn){
        this.isbn=isbn;
    }
    public String getisbn(){
        return isbn;
    }public void setauthor(String author){
        this.author=author;
    }
    public String getauthor(){
        return author;
    }public void setqnty(String publisher){
        this.publisher=publisher;
    }
    public int getpublisher(){
        return publisher;
    }
    public void getBookinfo(){
        System.out.println("Book information are:"+"bname"+"isbn"+"author"+"publisher");
    }
}