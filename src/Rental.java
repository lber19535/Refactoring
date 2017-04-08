/**
 * Created by Bill on 2017/4/6.
 */
public class Rental {

    Movie _movie;
    private int _dayRented;

    public Rental(Movie movie, int daysRented) {
        this._movie = movie;
        this._dayRented = daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDayRented() {
        return _dayRented;
    }

    int getFreqRenterPoints() {
        if ((getMovie().getPriceCode()) == Movie.NEW_RELEASE && getDayRented() > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
