/**
 * Created by Bill on 2017/4/8.
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int rentalDays) {
        double result = rentalDays * 3;
        return result;
    }

    @Override
    int getFreqRenterPoints(int rentalDays) {
        return rentalDays > 1 ? 2 : 1;
    }
}
