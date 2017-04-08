import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Bill on 2017/4/6.
 */
public class Customer {

    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental ren) {

    }

    public String getName() {
        return name;
    }

    public String satement() {
        double totalAmount = 0;
        int freqRenterPoints = 0;
        Enumeration rens = rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rens.hasMoreElements()) {

            Rental each = (Rental) rens.nextElement();

            freqRenterPoints += each._movie.getFreqRenterPoints(each);
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
            totalAmount += each.getCharge();
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalPoints()) + " frequent renter points";
        return result;
    }

    public String htmlStatement() {
        Enumeration elements = rentals.elements();
        String result = "<h1>Rentals for <em>" + getName() + "</em><h1><p>\n";
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();
            result += each.getMovie().getTitle() + ": " + each.getCharge() + "<br>\n";
        }

        result += "<p>You owe<em>" + getTotalCharge() + "</em><p>\n";
        result += "On this rental you earned <en>" + getTotalPoints() + "</em> frequent renter points<p>";
        return result;
    }

    private double getTotalCharge() {
        Enumeration elements = rentals.elements();
        double result = 0;
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalPoints() {
        Enumeration elements = rentals.elements();
        int result = 0;
        while (elements.hasMoreElements()) {
            Rental each = (Rental) elements.nextElement();
            result += each._movie.getFreqRenterPoints(each);
        }
        return result;
    }

}
