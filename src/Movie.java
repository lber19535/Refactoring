/**
 * Created by Bill on 2017/4/6.
 */
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private Price price;

    public Movie(String title, int priceCode) {
        this._title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int _priceCode) {
        switch (_priceCode) {
            case REGULAR:
                price = new RegularPrice();
            case NEW_RELEASE:
                price = new NewReleasePrice();
            case CHILDRENS:
                price = new ChildrensPrice();
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
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
