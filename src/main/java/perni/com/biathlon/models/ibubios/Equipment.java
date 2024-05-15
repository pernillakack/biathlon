package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
@JacksonXmlRootElement(localName = "Equipment")
public class Equipment {
    @JacksonXmlProperty(localName = "CISBiosValue")
    private List<CISBiosValue> CISBiosValue;

    @Override
    public String toString() {
        return "Equipment{" +
                "CISBiosValue=" + CISBiosValue +
                '}';
    }

    public Equipment(){}
    public Equipment(List<perni.com.biathlon.models.ibubios.CISBiosValue> CISBiosValue) {
        this.CISBiosValue = CISBiosValue;
    }

    public List<perni.com.biathlon.models.ibubios.CISBiosValue> getCISBiosValue() {
        return CISBiosValue;
    }

    public void setCISBiosValue(List<perni.com.biathlon.models.ibubios.CISBiosValue> CISBiosValue) {
        this.CISBiosValue = CISBiosValue;
    }
}

