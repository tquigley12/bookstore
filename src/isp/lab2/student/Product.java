package isp.lab2.student;

import java.time.LocalDate;

/**
 *
 * @author tquigley1
 * 
 * This interface is used for the features common between books and music products.
 * 
 */
public interface Product {
    
    public String getTitle();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public void order(int quantity);

    public String getFormattedReleaseDate();

}
