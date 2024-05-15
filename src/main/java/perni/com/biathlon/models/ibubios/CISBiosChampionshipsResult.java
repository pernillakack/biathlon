package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

public class CISBiosChampionshipsResult {
    @JacksonXmlProperty(localName = "Year")
    private String Year;
    @JacksonXmlProperty(localName = "SeasonId")
    private int SeasonId;
    @JacksonXmlProperty(localName = "Place")
    private String Place;
    @JacksonXmlProperty(localName = "Ind")
    private int Ind;
    @JacksonXmlProperty(localName = "Spr")
    private int Spr;
    @JacksonXmlProperty(localName = "Pur")
    private int Pur;
    @JacksonXmlProperty(localName = "Mas")
    private int Mas;
    @JacksonXmlProperty(localName = "Rel")
    private int Rel;
    @JacksonXmlProperty(localName = "MxRel")
    private int MxRel;
    @JacksonXmlProperty(localName = "Ind_Id")
    private String Ind_Id;
    @JacksonXmlProperty(localName = "Spr_Id")
    private String Spr_Id;
    @JacksonXmlProperty(localName = "Pur_Id")
    private String Pur_Id;
    @JacksonXmlProperty(localName = "Mas_Id")
    private String Mas_Id;
    @JacksonXmlProperty(localName = "Rel_Id")
    private String Rel_Id;
    @JacksonXmlProperty(localName = "MxRel_Id")
    private String MxRel_Id;
    @JacksonXmlProperty(localName = "SxRel")
    private String SxRel;
    @JacksonXmlProperty(localName = "SxRel_Id")
    private String SxRel_Id;
    @JacksonXmlProperty(localName = "Tot_Id")
    private String Tot_Id;
    @JacksonXmlProperty(localName = "Tot")
    private int Tot;
    @JacksonXmlProperty(localName = "Tot_Score")
    private int Tot_Score;

    public CISBiosChampionshipsResult() {}

    public CISBiosChampionshipsResult(String year, int seasonId, String place, int ind, int spr, int pur, int mas, int rel, int mxRel, String ind_Id, String spr_Id, String pur_Id, String mas_Id, String rel_Id, String mxRel_Id, String sxRel, String sxRel_Id, String tot_Id, int tot, int tot_Score) {
        Year = year;
        SeasonId = seasonId;
        Place = place;
        Ind = ind;
        Spr = spr;
        Pur = pur;
        Mas = mas;
        Rel = rel;
        MxRel = mxRel;
        Ind_Id = ind_Id;
        Spr_Id = spr_Id;
        Pur_Id = pur_Id;
        Mas_Id = mas_Id;
        Rel_Id = rel_Id;
        MxRel_Id = mxRel_Id;
        SxRel = sxRel;
        SxRel_Id = sxRel_Id;
        Tot_Id = tot_Id;
        Tot = tot;
        Tot_Score = tot_Score;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public int getSeasonId() {
        return SeasonId;
    }

    public void setSeasonId(int seasonId) {
        SeasonId = seasonId;
    }

    public String getPlace() {
        return Place;
    }

    public void setPlace(String place) {
        Place = place;
    }

    public int getInd() {
        return Ind;
    }

    public void setInd(int ind) {
        Ind = ind;
    }

    public int getSpr() {
        return Spr;
    }

    public void setSpr(int spr) {
        Spr = spr;
    }

    public int getPur() {
        return Pur;
    }

    public void setPur(int pur) {
        Pur = pur;
    }

    public int getMas() {
        return Mas;
    }

    public void setMas(int mas) {
        Mas = mas;
    }

    public int getRel() {
        return Rel;
    }

    public void setRel(int rel) {
        Rel = rel;
    }

    public int getMxRel() {
        return MxRel;
    }

    public void setMxRel(int mxRel) {
        MxRel = mxRel;
    }

    public String getInd_Id() {
        return Ind_Id;
    }

    public void setInd_Id(String ind_Id) {
        Ind_Id = ind_Id;
    }

    public String getSpr_Id() {
        return Spr_Id;
    }

    public void setSpr_Id(String spr_Id) {
        Spr_Id = spr_Id;
    }

    public String getPur_Id() {
        return Pur_Id;
    }

    public void setPur_Id(String pur_Id) {
        Pur_Id = pur_Id;
    }

    public String getMas_Id() {
        return Mas_Id;
    }

    public void setMas_Id(String mas_Id) {
        Mas_Id = mas_Id;
    }

    public String getRel_Id() {
        return Rel_Id;
    }

    public void setRel_Id(String rel_Id) {
        Rel_Id = rel_Id;
    }

    public String getMxRel_Id() {
        return MxRel_Id;
    }

    public void setMxRel_Id(String mxRel_Id) {
        MxRel_Id = mxRel_Id;
    }

    public String getSxRel() {
        return SxRel;
    }

    public void setSxRel(String sxRel) {
        SxRel = sxRel;
    }

    public String getSxRel_Id() {
        return SxRel_Id;
    }

    public void setSxRel_Id(String sxRel_Id) {
        SxRel_Id = sxRel_Id;
    }

    public String getTot_Id() {
        return Tot_Id;
    }

    public void setTot_Id(String tot_Id) {
        Tot_Id = tot_Id;
    }

    public int getTot() {
        return Tot;
    }

    public void setTot(int tot) {
        Tot = tot;
    }

    public int getTot_Score() {
        return Tot_Score;
    }

    public void setTot_Score(int tot_Score) {
        Tot_Score = tot_Score;
    }

    @Override
    public String toString() {
        return "CISBiosChampionshipsResult{" +
                "Year=" + Year +
                ", SeasonId=" + SeasonId +
                ", Place='" + Place + '\'' +
                ", Ind=" + Ind +
                ", Spr=" + Spr +
                ", Pur=" + Pur +
                ", Mas=" + Mas +
                ", Rel=" + Rel +
                ", MxRel=" + MxRel +
                ", Ind_Id='" + Ind_Id + '\'' +
                ", Spr_Id='" + Spr_Id + '\'' +
                ", Pur_Id='" + Pur_Id + '\'' +
                ", Mas_Id='" + Mas_Id + '\'' +
                ", Rel_Id='" + Rel_Id + '\'' +
                ", MxRel_Id='" + MxRel_Id + '\'' +
                ", SxRel=" + SxRel +
                ", SxRel_Id='" + SxRel_Id + '\'' +
                ", Tot_Id='" + Tot_Id + '\'' +
                ", Tot=" + Tot +
                ", Tot_Score=" + Tot_Score +
                '}';
    }
}
