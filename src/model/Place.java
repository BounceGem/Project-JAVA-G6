package model;

import java.sql.*;

public class Place {

    private long placeId;
    private String placeName, placeDescription, rule;
    private Account acccounnt;

    public void add(String locationName, String locationDescription) {

    }

    public void edit(String locationName, String locationDescription) {

    }

    public void delete(String locationName, String locationDescription) {

    }

    public static void orm(ResultSet rs, Place place) throws SQLException {
        place.setPlaceDescription(rs.getString("placedescription"));
        place.setRule(rs.getString("rule"));
        place.setPlaceId(rs.getLong("placeid"));
    }

    public long getPlaceId() {
        return placeId;
    }

    public void setPlaceId(long placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceDescription() {
        return placeDescription;
    }

    public void setPlaceDescription(String placeDescription) {
        this.placeDescription = placeDescription;
    }

    public Account getAcccounnt() {
        return acccounnt;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public void setAcccounnt(Account acccounnt) {
        this.acccounnt = acccounnt;
    }

}
