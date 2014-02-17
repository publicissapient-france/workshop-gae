package fr.xebia.gae.yawyl.model;


import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.util.Date;

@Entity
public class Concert {

    @Id
    private Long id;
    private final String artistName;
    private final Date date;
    private final double longitude;
    private final double latitude;

    public Concert(String artistName, Date date, double longitude, double latitude) {
        this.artistName = artistName;
        this.date = date;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getArtistName() {
        return artistName;
    }

    public Date getDate() {
        return date;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
}
