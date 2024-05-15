package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
@JacksonXmlRootElement(localName = "OWG")
public class OWG {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "CISBiosChampionshipsResult")
    private List<CISBiosChampionshipsResult> CISBiosChampionshipsResult;

    @Override
    public String toString() {
        return "OWG{" +
                "CISBiosChampionshipsResult=" + CISBiosChampionshipsResult +
                '}';
    }

    public OWG(){}
    public OWG(List<perni.com.biathlon.models.ibubios.CISBiosChampionshipsResult> CISBiosChampionshipsResult) {
        this.CISBiosChampionshipsResult = CISBiosChampionshipsResult;
    }

    public List<perni.com.biathlon.models.ibubios.CISBiosChampionshipsResult> getCISBiosChampionshipsResult() {
        return CISBiosChampionshipsResult;
    }

    public void setCISBiosChampionshipsResult(List<perni.com.biathlon.models.ibubios.CISBiosChampionshipsResult> CISBiosChampionshipsResult) {
        this.CISBiosChampionshipsResult = CISBiosChampionshipsResult;
    }
}
