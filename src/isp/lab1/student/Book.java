package isp.lab1.student;

import java.time.LocalDate;

/**
 *
 * @author tquigley1
 * 
 * This is an interface for books to be used in the bookstore project.
 */
public interface Book {
    
    public String getTitle();

    public String getISBN();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getAuthor();

    public void order(int quantity);

    public int getPages();

    public String getFormattedReleaseDate();

}
