package extends1.ex;

/**
 * packageName    : extends1.ex
 * fileName       : Album
 * author         : wnsgh
 * date           : 2024-08-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-25        wnsgh       최초 생성
 */
public class Album extends Item{
    private String artist;

    public Album(String name,int price,String artist) {
        super(name,price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트:"+artist);
    }
}
