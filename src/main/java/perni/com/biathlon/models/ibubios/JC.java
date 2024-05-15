package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "JC")
public class JC {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "CISBiosChampionshipsResult")
    private CISBiosChampionshipsResult CISBiosChampionshipsResult;

    @Override
    public String toString() {
        return "JC{" +
                "CISBiosChampionshipsResult=" + CISBiosChampionshipsResult +
                '}';
    }
    public JC(){}

    public JC(perni.com.biathlon.models.ibubios.CISBiosChampionshipsResult CISBiosChampionshipsResult) {
        this.CISBiosChampionshipsResult = CISBiosChampionshipsResult;
    }

    public perni.com.biathlon.models.ibubios.CISBiosChampionshipsResult getCISBiosChampionshipsResult() {
        return CISBiosChampionshipsResult;
    }

    public void setCISBiosChampionshipsResult(perni.com.biathlon.models.ibubios.CISBiosChampionshipsResult CISBiosChampionshipsResult) {
        this.CISBiosChampionshipsResult = CISBiosChampionshipsResult;
    }
}

