package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import perni.com.biathlon.models.deserializers.All_OWGDeserializer;

@JacksonXmlRootElement(localName = "All_OWG")
@JsonDeserialize(using = All_OWGDeserializer.class)
public class All_OWG {
    @JacksonXmlProperty(localName = "nil")
    private boolean nil;
    private int intValue;

    @Override
    public String toString() {
        return "All_OWG{" +
                "nil=" + nil +
                ", intValue=" + intValue +
                '}';
    }

    public All_OWG(){}

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }
}
