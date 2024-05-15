package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Total_OWG")
public class Total_OWG {
    @JacksonXmlProperty(localName = "nil")
    private boolean nil;

    @Override
    public String toString() {
        return "Total_OWG{" +
                "nil=" + nil +
                '}';
    }

    public Total_OWG(boolean nil) {
        this.nil = nil;
    }

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }
}

