/**
 * Created by Bill on 2017/4/6.
 */
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        this._title = title;
        this._priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    public String getTitle() {
        return _title;
    }

    double getCharge(int rentalDays) {
        double result = 0;
        switch (getPriceCode()) {
            case REGULAR:
                result += 2;
                if (rentalDays > 2) {
                    result += (rentalDays - 2) * 1.5;
                }
                break;
            case NEW_RELEASE:
                result += 1.5;
                break;
            case CHILDRENS:
                result += 1.5;
                if (rentalDays > 3) {
                    result += (rentalDays - 3) * 1.5;
                }
                break;
        }
        return result;
    }

    int getFreqRenterPoints(int rentalDays) {
        if ((getPriceCode()) == NEW_RELEASE && rentalDays > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
