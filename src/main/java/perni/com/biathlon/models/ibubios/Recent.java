package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
@JacksonXmlRootElement(localName = "Recent")
public class Recent {
    @JacksonXmlProperty(localName = "CISBiosResult")
    private List<CISBiosResult> CISBiosResult;

    @Override
    public String toString() {
        return "Recent{" +
                "CISBiosResult=" + CISBiosResult +
                '}';
    }
    public Recent(){}
    public Recent(List<perni.com.biathlon.models.ibubios.CISBiosResult> CISBiosResult) {
        this.CISBiosResult = CISBiosResult;
    }

    public List<perni.com.biathlon.models.ibubios.CISBiosResult> getCISBiosResult() {
        return CISBiosResult;
    }

    public void setCISBiosResult(List<perni.com.biathlon.models.ibubios.CISBiosResult> CISBiosResult) {
        this.CISBiosResult = CISBiosResult;
    }
}
