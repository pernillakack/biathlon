package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Bibs")
public class Bibs {
    @JacksonXmlProperty(localName = "BibInfo")
    private BibInfo BibInfo;

    public Bibs(){}
    @Override
    public String toString() {
        return "Bibs{" +
                "BibInfo=" + BibInfo +
                '}';
    }

    public perni.com.biathlon.models.ibubios.BibInfo getBibInfo() {
        return BibInfo;
    }

    public void setBibInfo(perni.com.biathlon.models.ibubios.BibInfo bibInfo) {
        BibInfo = bibInfo;
    }
}

