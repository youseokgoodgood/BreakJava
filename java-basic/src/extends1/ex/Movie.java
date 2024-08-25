package extends1.ex;

/**
 * packageName    : extends1.ex
 * fileName       : Movie
 * author         : wnsgh
 * date           : 2024-08-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-08-25        wnsgh       최초 생성
 */
public class Movie extends Item{
    private String director;
    private String actor;

    public Movie(String name,int price,String director, String actor) {
        super(name,price);
        this.director = director;
        this.actor = actor;
    }


    @Override
    public void print() {
        super.print();
        System.out.println("- 감독:"+director+",  배우:"+actor);
    }
}
