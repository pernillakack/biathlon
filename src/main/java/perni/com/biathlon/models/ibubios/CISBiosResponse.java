package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.Date;
public class CISBiosResponse {
    @JacksonXmlProperty(localName = "IBUId")
    private String IBUId;
    @JacksonXmlProperty(localName = "FullName")
    private String FullName;
    @JacksonXmlProperty(localName = "FamilyName")
    private String FamilyName;
    @JacksonXmlProperty(localName = "GivenName")
    private String GivenName;
    @JacksonXmlProperty(localName = "NAT")
    private String NAT;
    @JacksonXmlProperty(localName = "NF")
    private String NF;
    @JacksonXmlProperty(localName = "Birthdate")
    private Date Birthdate;
    @JacksonXmlProperty(localName = "BirthYear")
    private int BirthYear;
    @JacksonXmlProperty(localName = "Age")
    private int Age;
    @JacksonXmlProperty(localName = "GenderId")
    private String GenderId;
    @JacksonXmlProperty(localName = "Functions")
    private String Functions;
    @JacksonXmlProperty(localName = "PhotoURI")
    private String PhotoURI;
    @JacksonXmlProperty(localName = "FlagURI")
    private String FlagURI;
    @JacksonXmlProperty(localName = "Personal")
    private Personal Personal;
    @JacksonXmlProperty(localName = "Sport")
    private Sport Sport;
    @JacksonXmlProperty(localName = "Equipment")
    private Equipment Equipment;
    @JacksonXmlProperty(localName = "Stats")
    private Stats Stats;
    @JacksonXmlProperty(localName = "Stories")
    private Object Stories;
    @JacksonXmlProperty(localName = "Recent")
    private Recent Recent;
    @JacksonXmlProperty(localName = "OWG")
    private OWG OWG;
    @JacksonXmlProperty(localName = "WCH")
    private WCH WCH;
    @JacksonXmlProperty(localName = "JWCH")
    private JWCH JWCH;
    @JacksonXmlProperty(localName = "WC")
    private WC WC;
    @JacksonXmlProperty(localName = "IC")
    private IC IC;
    @JacksonXmlProperty(localName = "JC")
    private JC JC;
    @JacksonXmlProperty(localName = "Podiums")
    private Podiums Podiums;
    @JacksonXmlProperty(localName = "TopResults")
    private TopResults TopResults;
    @JacksonXmlProperty(localName = "StatSeasons")
    private StatSeasons StatSeasons;
    @JacksonXmlProperty(localName = "StatShooting")
    private StatShooting StatShooting;
    @JacksonXmlProperty(localName = "StatShootingProne")
    private StatShootingProne StatShootingProne;
    @JacksonXmlProperty(localName = "StatShootingStanding")
    private StatShootingStanding StatShootingStanding;
    @JacksonXmlProperty(localName = "StatSkiing")
    private StatSkiing StatSkiing;
    @JacksonXmlProperty(localName = "StatSkiKMB")
    private StatSkiKMB StatSkiKMB;
    @JacksonXmlProperty(localName = "RNKS")
    private RNKS RNKS;
    @JacksonXmlProperty(localName = "Badges")
    private Badges Badges;
    @Override
    public String toString() {
        return "CISBiosResponse{" +
                "IBUId='" + IBUId + '\'' +
                ", FullName='" + FullName + '\'' +
                ", FamilyName='" + FamilyName + '\'' +
                ", GivenName='" + GivenName + '\'' +
                ", NAT='" + NAT + '\'' +
                ", NF='" + NF + '\'' +
                ", Birthdate=" + Birthdate +
                ", BirthYear=" + BirthYear +
                ", Age=" + Age +
                ", GenderId='" + GenderId + '\'' +
                ", Functions='" + Functions + '\'' +
                ", PhotoURI='" + PhotoURI + '\'' +
                ", FlagURI='" + FlagURI + '\'' +
                ", Personal=" + Personal +
                ", Sport=" + Sport +
                ", Equipment=" + Equipment +
                ", Stats=" + Stats +
                ", Stories=" + Stories +
                ", Recent=" + Recent +
                ", OWG=" + OWG +
                ", WCH=" + WCH +
                ", JWCH=" + JWCH +
                ", WC=" + WC +
                ", IC=" + IC +
                ", JC=" + JC +
                ", Podiums=" + Podiums +
                ", TopResults=" + TopResults +
                ", StatSeasons=" + StatSeasons +
                ", StatShooting=" + StatShooting +
                ", StatShootingProne=" + StatShootingProne +
                ", StatShootingStanding=" + StatShootingStanding +
                ", StatSkiing=" + StatSkiing +
                ", StatSkiKMB=" + StatSkiKMB +
                ", RNKS=" + RNKS +
                ", Badges=" + Badges +
                '}';
    }
    public String getIBUId() {
        return IBUId;
    }

    public void setIBUId(String IBUId) {
        this.IBUId = IBUId;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    public String getGivenName() {
        return GivenName;
    }

    public void setGivenName(String givenName) {
        GivenName = givenName;
    }

    public String getNAT() {
        return NAT;
    }

    public void setNAT(String NAT) {
        this.NAT = NAT;
    }

    public String getNF() {
        return NF;
    }

    public void setNF(String NF) {
        this.NF = NF;
    }

    public Date getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(Date birthdate) {
        Birthdate = birthdate;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(int birthYear) {
        BirthYear = birthYear;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGenderId() {
        return GenderId;
    }

    public void setGenderId(String genderId) {
        GenderId = genderId;
    }

    public String getFunctions() {
        return Functions;
    }

    public void setFunctions(String functions) {
        Functions = functions;
    }

    public String getPhotoURI() {
        return PhotoURI;
    }

    public void setPhotoURI(String photoURI) {
        PhotoURI = photoURI;
    }

    public String getFlagURI() {
        return FlagURI;
    }

    public void setFlagURI(String flagURI) {
        FlagURI = flagURI;
    }

    public perni.com.biathlon.models.ibubios.Personal getPersonal() {
        return Personal;
    }

    public void setPersonal(perni.com.biathlon.models.ibubios.Personal personal) {
        Personal = personal;
    }

    public perni.com.biathlon.models.ibubios.Sport getSport() {
        return Sport;
    }

    public void setSport(perni.com.biathlon.models.ibubios.Sport sport) {
        Sport = sport;
    }

    public perni.com.biathlon.models.ibubios.Equipment getEquipment() {
        return Equipment;
    }

    public void setEquipment(perni.com.biathlon.models.ibubios.Equipment equipment) {
        Equipment = equipment;
    }

    public perni.com.biathlon.models.ibubios.Stats getStats() {
        return Stats;
    }

    public void setStats(perni.com.biathlon.models.ibubios.Stats stats) {
        Stats = stats;
    }

    public Object getStories() {
        return Stories;
    }

    public void setStories(Object stories) {
        Stories = stories;
    }

    public perni.com.biathlon.models.ibubios.Recent getRecent() {
        return Recent;
    }

    public void setRecent(perni.com.biathlon.models.ibubios.Recent recent) {
        Recent = recent;
    }

    public perni.com.biathlon.models.ibubios.OWG getOWG() {
        return OWG;
    }

    public void setOWG(perni.com.biathlon.models.ibubios.OWG OWG) {
        this.OWG = OWG;
    }

    public perni.com.biathlon.models.ibubios.WCH getWCH() {
        return WCH;
    }

    public void setWCH(perni.com.biathlon.models.ibubios.WCH WCH) {
        this.WCH = WCH;
    }

    public perni.com.biathlon.models.ibubios.JWCH getJWCH() {
        return JWCH;
    }

    public void setJWCH(perni.com.biathlon.models.ibubios.JWCH JWCH) {
        this.JWCH = JWCH;
    }

    public perni.com.biathlon.models.ibubios.WC getWC() {
        return WC;
    }

    public void setWC(perni.com.biathlon.models.ibubios.WC WC) {
        this.WC = WC;
    }

    public perni.com.biathlon.models.ibubios.IC getIC() {
        return IC;
    }

    public void setIC(perni.com.biathlon.models.ibubios.IC IC) {
        this.IC = IC;
    }

    public perni.com.biathlon.models.ibubios.JC getJC() {
        return JC;
    }

    public void setJC(perni.com.biathlon.models.ibubios.JC JC) {
        this.JC = JC;
    }

    public perni.com.biathlon.models.ibubios.Podiums getPodiums() {
        return Podiums;
    }

    public void setPodiums(perni.com.biathlon.models.ibubios.Podiums podiums) {
        Podiums = podiums;
    }

    public perni.com.biathlon.models.ibubios.TopResults getTopResults() {
        return TopResults;
    }

    public void setTopResults(perni.com.biathlon.models.ibubios.TopResults topResults) {
        TopResults = topResults;
    }

    public perni.com.biathlon.models.ibubios.StatSeasons getStatSeasons() {
        return StatSeasons;
    }

    public void setStatSeasons(perni.com.biathlon.models.ibubios.StatSeasons statSeasons) {
        StatSeasons = statSeasons;
    }

    public perni.com.biathlon.models.ibubios.StatShooting getStatShooting() {
        return StatShooting;
    }

    public void setStatShooting(perni.com.biathlon.models.ibubios.StatShooting statShooting) {
        StatShooting = statShooting;
    }

    public perni.com.biathlon.models.ibubios.StatShootingProne getStatShootingProne() {
        return StatShootingProne;
    }

    public void setStatShootingProne(perni.com.biathlon.models.ibubios.StatShootingProne statShootingProne) {
        StatShootingProne = statShootingProne;
    }

    public perni.com.biathlon.models.ibubios.StatShootingStanding getStatShootingStanding() {
        return StatShootingStanding;
    }

    public void setStatShootingStanding(perni.com.biathlon.models.ibubios.StatShootingStanding statShootingStanding) {
        StatShootingStanding = statShootingStanding;
    }

    public perni.com.biathlon.models.ibubios.StatSkiing getStatSkiing() {
        return StatSkiing;
    }

    public void setStatSkiing(perni.com.biathlon.models.ibubios.StatSkiing statSkiing) {
        StatSkiing = statSkiing;
    }

    public perni.com.biathlon.models.ibubios.StatSkiKMB getStatSkiKMB() {
        return StatSkiKMB;
    }

    public void setStatSkiKMB(perni.com.biathlon.models.ibubios.StatSkiKMB statSkiKMB) {
        StatSkiKMB = statSkiKMB;
    }

    public perni.com.biathlon.models.ibubios.RNKS getRNKS() {
        return RNKS;
    }

    public void setRNKS(perni.com.biathlon.models.ibubios.RNKS RNKS) {
        this.RNKS = RNKS;
    }

    public perni.com.biathlon.models.ibubios.Badges getBadges() {
        return Badges;
    }

    public void setBadges(perni.com.biathlon.models.ibubios.Badges badges) {
        Badges = badges;
    }

    public CISBiosResponse(){}

    public CISBiosResponse(String IBUId, String fullName, String familyName, String givenName, String NAT, String NF, Date birthdate, int birthYear, int age, String genderId, String functions, String photoURI, String flagURI, perni.com.biathlon.models.ibubios.Personal personal, perni.com.biathlon.models.ibubios.Sport sport, perni.com.biathlon.models.ibubios.Equipment equipment, perni.com.biathlon.models.ibubios.Stats stats, Object stories, perni.com.biathlon.models.ibubios.Recent recent, perni.com.biathlon.models.ibubios.OWG OWG, perni.com.biathlon.models.ibubios.WCH WCH, perni.com.biathlon.models.ibubios.JWCH JWCH, perni.com.biathlon.models.ibubios.WC WC, perni.com.biathlon.models.ibubios.IC IC, perni.com.biathlon.models.ibubios.JC JC, perni.com.biathlon.models.ibubios.Podiums podiums, perni.com.biathlon.models.ibubios.TopResults topResults, perni.com.biathlon.models.ibubios.StatSeasons statSeasons, perni.com.biathlon.models.ibubios.StatShooting statShooting, perni.com.biathlon.models.ibubios.StatShootingProne statShootingProne, perni.com.biathlon.models.ibubios.StatShootingStanding statShootingStanding, perni.com.biathlon.models.ibubios.StatSkiing statSkiing, perni.com.biathlon.models.ibubios.StatSkiKMB statSkiKMB, perni.com.biathlon.models.ibubios.RNKS RNKS, perni.com.biathlon.models.ibubios.Badges badges) {
        this.IBUId = IBUId;
        FullName = fullName;
        FamilyName = familyName;
        GivenName = givenName;
        this.NAT = NAT;
        this.NF = NF;
        Birthdate = birthdate;
        BirthYear = birthYear;
        Age = age;
        GenderId = genderId;
        Functions = functions;
        PhotoURI = photoURI;
        FlagURI = flagURI;
        Personal = personal;
        Sport = sport;
        Equipment = equipment;
        Stats = stats;
        Stories = stories;
        Recent = recent;
        this.OWG = OWG;
        this.WCH = WCH;
        this.JWCH = JWCH;
        this.WC = WC;
        this.IC = IC;
        this.JC = JC;
        Podiums = podiums;
        TopResults = topResults;
        StatSeasons = statSeasons;
        StatShooting = statShooting;
        StatShootingProne = statShootingProne;
        StatShootingStanding = statShootingStanding;
        StatSkiing = statSkiing;
        StatSkiKMB = statSkiKMB;
        this.RNKS = RNKS;
        Badges = badges;
    }
}
