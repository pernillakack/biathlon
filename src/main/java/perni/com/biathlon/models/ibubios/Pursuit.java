package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "Pursuit")
public class Pursuit {
    @JacksonXmlProperty(localName = "nil", isAttribute = true)
    private boolean nil;

    @Override
    public String toString() {
        return "Pursuit{" +
                "nil=" + nil +
                '}';
    }

    public Pursuit(boolean nil) {
        this.nil = nil;
    }

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }
}
