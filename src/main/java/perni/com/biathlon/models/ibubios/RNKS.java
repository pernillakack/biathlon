package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
@JacksonXmlRootElement(localName = "RNKS")
public class RNKS {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "CISBiosRanking")
    private List<CISBiosRanking> CISBiosRanking;

    @Override
    public String toString() {
        return "RNKS{" +
                "CISBiosRanking=" + CISBiosRanking +
                '}';
    }

    public RNKS(){}
    public RNKS(List<perni.com.biathlon.models.ibubios.CISBiosRanking> CISBiosRanking) {
        this.CISBiosRanking = CISBiosRanking;
    }

    public List<perni.com.biathlon.models.ibubios.CISBiosRanking> getCISBiosRanking() {
        return CISBiosRanking;
    }

    public void setCISBiosRanking(List<perni.com.biathlon.models.ibubios.CISBiosRanking> CISBiosRanking) {
        this.CISBiosRanking = CISBiosRanking;
    }
}