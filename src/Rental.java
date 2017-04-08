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

    public double getCharge() {
        return _movie.getPrice().getCharge(_dayRented);
    }

    public int getFreqRenterPoints() {
        return _movie.price.getFreqRenterPoints(_dayRented);
    }
}
