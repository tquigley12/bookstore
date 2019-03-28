package isp.lab1;

import java.time.Duration;
import java.time.LocalDate;

public interface Product {

    public String getTitle();

    public String getISBN();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getAuthor();

    public String getArtist();

    public void order(int quantity);

    public int getPages();

    public Duration getPlayingTime();

    public String getFormattedReleaseDate();

}
