/**
 * Created by Bill on 2017/4/8.
 */
public abstract class Price {
    abstract int getPriceCode();

    abstract double getCharge(int rentalDays);

    int getFreqRenterPoints(int rentalDays) {
        return 1;
    }
}
