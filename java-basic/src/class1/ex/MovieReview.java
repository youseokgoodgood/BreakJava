package class1.ex;

public class MovieReview {

    String title;
    String review;

    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();

        movieReview1.title = "어벤져스";
        movieReview1.review = "재밌음";

        MovieReview movieReview2 = new MovieReview();

        movieReview2.title = "데드풀";
        movieReview2.review = "겁나 재밌음";

        //System.out.println("movieReview.title = " + movieReview.title + " movieReview.review = "+ movieReview.review);

        MovieReview[] movieReviews = {movieReview1,movieReview2};

        for (MovieReview mr : movieReviews) {
            System.out.println("title = " + mr.title + " review = " + mr.review);
        }


    }
}
