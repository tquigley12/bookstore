package isp.lab1.instructor;

import java.time.Duration;
import java.time.LocalDate;

public interface Album {

    public String getArtist();

    public Duration getPlayingTime();

    public String getTitle();

    public double getCost();

    public int getQuantityOnHand();

    public LocalDate getReleaseDate();

    public void order(int quantity);

    public String getFormattedReleaseDate();

}
