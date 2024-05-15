package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Root {
    @JacksonXmlProperty(localName = "CISBiosResponse")
    private CISBiosResponse CISBiosResponse;
    @JacksonXmlProperty(localName = "xsi")
    private String xsi;
    @JacksonXmlProperty(localName = "text")
    private String text;

    @Override
    public String toString() {
        return "Root{" +
                "CISBiosResponse=" + CISBiosResponse +
                ", xsi='" + xsi + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public Root() {}
    public Root(perni.com.biathlon.models.ibubios.CISBiosResponse CISBiosResponse, String xsi, String text) {
        this.CISBiosResponse = CISBiosResponse;
        this.xsi = xsi;
        this.text = text;
    }

    public String getXsi() {
        return xsi;
    }

    public void setXsi(String xsi) {
        this.xsi = xsi;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public perni.com.biathlon.models.ibubios.CISBiosResponse getCISBiosResponse() {
        return CISBiosResponse;
    }

    public void setCISBiosResponse(perni.com.biathlon.models.ibubios.CISBiosResponse CISBiosResponse) {
        this.CISBiosResponse = CISBiosResponse;
    }
}
