/**
 * Created by Bill on 2017/4/6.
 */
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    Price price;

    public Movie(String title, int priceCode) {
        this._title = title;
        setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public Price getPrice(){
        return price;
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

}
