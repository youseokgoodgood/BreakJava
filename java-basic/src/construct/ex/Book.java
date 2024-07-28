package construct.ex;

public class Book {
    String title; //제목
    String author;//저자
    int page; //페이지수

    public Book() {
        this("","",0);
    }

    public Book(String title, String author) {
       this(title,author,0);
    }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목: "+this.title+", 저자: "+this.author+", 페이지: "+this.page);
    }
}
