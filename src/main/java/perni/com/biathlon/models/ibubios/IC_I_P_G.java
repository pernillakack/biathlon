package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "IC_I_P_G")
public class IC_I_P_G {
    @JacksonXmlProperty(localName = "nil")
    private boolean nil;

    @Override
    public String toString() {
        return "IC_I_P_G{" +
                "nil=" + nil +
                '}';
    }

    public IC_I_P_G(){}
    public IC_I_P_G(boolean nil) {
        this.nil = nil;
    }

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }
}