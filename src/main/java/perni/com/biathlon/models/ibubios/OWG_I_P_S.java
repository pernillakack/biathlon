package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "OWG_I_P_S")
public class OWG_I_P_S {
    @JacksonXmlProperty(localName = "nil")
    private boolean nil;

    @Override
    public String toString() {
        return "OWG_I_P_S{" +
                "nil=" + nil +
                '}';
    }

    public OWG_I_P_S(boolean nil) {
        this.nil = nil;
    }

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }
}
