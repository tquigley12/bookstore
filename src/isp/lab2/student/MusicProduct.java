package isp.lab2.student;

import java.time.Duration;

/**
 *
 * @author tquigley1
 * 
 * This interface is used for features used in music products but not in books.
 */

public interface MusicProduct extends Product {
    
    public String getArtist();

    public Duration getPlayingTime();

}
