package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
@JacksonXmlRootElement(localName = "Sport")
public class Sport {
    @JacksonXmlProperty(localName = "CISBiosValue")
    private List<CISBiosValue> CISBiosValue;

    @Override
    public String toString() {
        return "Sport{" +
                "CISBiosValue=" + CISBiosValue +
                '}';
    }

    public Sport(){}
    public Sport(List<perni.com.biathlon.models.ibubios.CISBiosValue> CISBiosValue) {
        this.CISBiosValue = CISBiosValue;
    }

    public List<perni.com.biathlon.models.ibubios.CISBiosValue> getCISBiosValue() {
        return CISBiosValue;
    }

    public void setCISBiosValue(List<perni.com.biathlon.models.ibubios.CISBiosValue> CISBiosValue) {
        this.CISBiosValue = CISBiosValue;
    }
}

