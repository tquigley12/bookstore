package isp.lab1.student;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author tquigley1
 * 
 * This is an interface for music products to be used in the bookstore project.
 */
public interface MusicProduct {
    
    public String getTitle();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public String getArtist();

    public void order(int quantity);

    public Duration getPlayingTime();

    public String getFormattedReleaseDate();

}
