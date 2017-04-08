/**
 * Created by Bill on 2017/4/8.
 */
public class ChildrensPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getCharge(int rentalDays) {
        double result = 1.5;
        if (rentalDays > 3) {
            result += (rentalDays - 3) * 1.5;
        }
        return result;
    }
}
