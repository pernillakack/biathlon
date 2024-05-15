package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
@JacksonXmlRootElement(localName = "Personal")
public class Personal {
    @JacksonXmlProperty(localName = "CISBiosValue")
    private List<CISBiosValue> CISBiosValue;

    @Override
    public String toString() {
        return "Personal{" +
                "CISBiosValue=" + CISBiosValue +
                '}';
    }

    public Personal() {}
    public Personal(List<perni.com.biathlon.models.ibubios.CISBiosValue> CISBiosValue) {
        this.CISBiosValue = CISBiosValue;
    }

    public List<perni.com.biathlon.models.ibubios.CISBiosValue> getCISBiosValue() {
        return CISBiosValue;
    }

    public void setCISBiosValue(List<perni.com.biathlon.models.ibubios.CISBiosValue> CISBiosValue) {
        this.CISBiosValue = CISBiosValue;
    }
}
