package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class CISBiosResult {
    @JacksonXmlProperty(localName = "RaceId")
    private String RaceId;
    @JacksonXmlProperty(localName = "SeasonId")
    private String SeasonId;
    @JacksonXmlProperty(localName = "Season")
    private String Season;
    @JacksonXmlProperty(localName = "Comp")
    private String Comp;
    @JacksonXmlProperty(localName = "Competition")
    private String Competition;
    @JacksonXmlProperty(localName = "Level")
    private String Level;
    @JacksonXmlProperty(localName = "Place")
    private String Place;
    @JacksonXmlProperty(localName = "PlaceNat")
    private String PlaceNat;
    @JacksonXmlProperty(localName = "Rank")
    private int Rank;
    @JacksonXmlProperty(localName = "SO")
    private int SO;
    @JacksonXmlProperty(localName = "Pen")
    private int Pen;
    @JacksonXmlProperty(localName = "Shootings")
    private String Shootings;

    public CISBiosResult(){}
    public CISBiosResult(String raceId){
        RaceId = raceId;
    }
    public CISBiosResult(String raceId, String seasonId, String season, String comp, String competition, String level, String place, String placeNat, int rank, int SO, int pen, String shootings) {
        RaceId = raceId;
        SeasonId = seasonId;
        Season = season;
        Comp = comp;
        Competition = competition;
        Level = level;
        Place = place;
        PlaceNat = placeNat;
        Rank = rank;
        this.SO = SO;
        Pen = pen;
        Shootings = shootings;
    }




    public String getRaceId() {
        return RaceId;
    }

    public void setRaceId(String raceId) {
        RaceId = raceId;
    }

    public String getSeasonId() {
        return SeasonId;
    }

    public void setSeasonId(String seasonId) {
        SeasonId = seasonId;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getComp() {
        return Comp;
    }

    public void setComp(String comp) {
        Comp = comp;
    }

    public String getCompetition() {
        return Competition;
    }

    public void setCompetition(String competition) {
        Competition = competition;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public String getPlaceNat() {
        return PlaceNat;
    }

    public void setPlaceNat(String placeNat) {
        PlaceNat = placeNat;
    }

    public int getRank() {
        return Rank;
    }

    public void setRank(int rank) {
        Rank = rank;
    }

    public int getSO() {
        return SO;
    }

    public void setSO(int SO) {
        this.SO = SO;
    }

    public int getPen() {
        return Pen;
    }

    public void setPen(int pen) {
        Pen = pen;
    }

    public String getShootings() {
        return Shootings;
    }

    public void setShootings(String shootings) {
        Shootings = shootings;
    }

    @Override
    public String toString() {
        return "CISBiosResult{" +
                "RaceId='" + RaceId + '\'' +
                ", SeasonId=" + SeasonId +
                ", Season='" + Season + '\'' +
                ", Comp='" + Comp + '\'' +
                ", Competition='" + Competition + '\'' +
                ", Level='" + Level + '\'' +
                ", Place='" + Place + '\'' +
                ", PlaceNat='" + PlaceNat + '\'' +
                ", Rank=" + Rank +
                ", SO=" + SO +
                ", Pen=" + Pen +
                ", Shootings='" + Shootings + '\'' +
                '}';
    }

}