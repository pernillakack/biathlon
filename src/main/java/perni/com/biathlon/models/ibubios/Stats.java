package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Stats")
public class Stats {
    @JacksonXmlProperty(localName = "CISBiosValue")
    private CISBiosValue CISBiosValue;

    @Override
    public String toString() {
        return "Stats{" +
                "CISBiosValue=" + CISBiosValue +
                '}';
    }

    public Stats(){}
    public Stats(perni.com.biathlon.models.ibubios.CISBiosValue CISBiosValue) {
        this.CISBiosValue = CISBiosValue;
    }

    public perni.com.biathlon.models.ibubios.CISBiosValue getCISBiosValue() {
        return CISBiosValue;
    }

    public void setCISBiosValue(perni.com.biathlon.models.ibubios.CISBiosValue CISBiosValue) {
        this.CISBiosValue = CISBiosValue;
    }
}

