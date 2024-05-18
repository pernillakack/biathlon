package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "Bibs")
public class Bibs {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "BibInfo")
    private List<BibInfo> BibInfo;

    public Bibs(){}

    @Override
    public String toString() {
        return "Bibs{" +
                "BibInfo=" + BibInfo +
                '}';
    }

    public List<perni.com.biathlon.models.ibubios.BibInfo> getBibInfo() {
        return BibInfo;
    }

    public void setBibInfo(List<perni.com.biathlon.models.ibubios.BibInfo> bibInfo) {
        BibInfo = bibInfo;
    }
}

