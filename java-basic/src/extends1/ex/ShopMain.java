package extends1.ex;

/**
 * packageName    : extends1.ex
 * fileName       : ShopMain
 * author         : wnsgh
 * date           : 2024-08-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-25        wnsgh       최초 생성
 */
public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("Java",10000,"han","12345");
        Album album = new Album("앨범1",15000,"seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);

    }
}
