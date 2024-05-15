package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CISBiosRanking {
    @JacksonXmlProperty(localName = "Description")
    private Integer Description;
    @JacksonXmlProperty(localName = "Individual")
    private Integer Individual;
    @JacksonXmlProperty(localName = "Sprint")
    private Integer Sprint;
    @JacksonXmlProperty(localName = "Pursuit")
    private Integer Pursuit;
    @JacksonXmlProperty(localName = "MasStart")
    private Integer MasStart;
    @JacksonXmlProperty(localName = "All_OWG")
    private All_OWG All_OWG;

    @Override
    public String toString() {
        return "CISBiosRanking{" +
                "Description=" + Description +
                ", Individual=" + Individual +
                ", Sprint=" + Sprint +
                ", Pursuit=" + Pursuit +
                ", MasStart=" + MasStart +
                ", All_OWG=" + All_OWG +
                '}';
    }

    public CISBiosRanking(){}
    public CISBiosRanking(perni.com.biathlon.models.ibubios.All_OWG all_OWG) {
        All_OWG = all_OWG;
    }

    public Integer getDescription() {
        return Description;
    }

    public void setDescription(Integer description) {
        Description = description;
    }

    public Integer getIndividual() {
        return Individual;
    }

    public void setIndividual(Integer individual) {
        Individual = individual;
    }

    public Integer getSprint() {
        return Sprint;
    }

    public void setSprint(Integer sprint) {
        Sprint = sprint;
    }

    public Integer getPursuit() {
        return Pursuit;
    }

    public void setPursuit(Integer pursuit) {
        Pursuit = pursuit;
    }

    public Integer getMasStart() {
        return MasStart;
    }

    public void setMasStart(Integer masStart) {
        MasStart = masStart;
    }

    public perni.com.biathlon.models.ibubios.All_OWG getAll_OWG() {
        return All_OWG;
    }

    public void setAll_OWG(perni.com.biathlon.models.ibubios.All_OWG all_OWG) {
        All_OWG = all_OWG;
    }
}
