package isp.lab1.instructor;

import java.time.LocalDate;

public interface Book {

    public String getISBN();

    public String getAuthor();

    public int getPages();

    public String getTitle();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public void order(int quantity);

    public String getFormattedReleaseDate();

}
