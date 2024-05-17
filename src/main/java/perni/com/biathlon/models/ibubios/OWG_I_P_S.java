package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import perni.com.biathlon.models.deserializers.OWG_I_P_SDeserializer;

@JsonDeserialize(using = OWG_I_P_SDeserializer.class)
public class OWG_I_P_S {
    @JacksonXmlProperty(localName = "nil")
    private boolean nil;
    private int intValue;

    @Override
    public String toString() {
        return "OWG_I_P_S{" +
                "nil=" + nil +
                ", intValue=" + getIntValue() +
                '}';
    }

    public int getIntValue() {
        return intValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public OWG_I_P_S() {}

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }
}
