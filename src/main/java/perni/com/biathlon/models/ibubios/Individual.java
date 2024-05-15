package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Individual")
public class Individual {
    @JacksonXmlProperty(localName = "nil")
    private boolean nil;

    @Override
    public String toString() {
        return "Individual{" +
                "nil=" + nil +
                '}';
    }

    public Individual(boolean nil) {
        this.nil = nil;
    }

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }
}
