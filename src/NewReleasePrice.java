/**
 * Created by Bill on 2017/4/8.
 */
public class NewReleasePrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}
