package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import perni.com.biathlon.models.deserializers.WCH_T_P_GDeserializer;

@JsonDeserialize(using = WCH_T_P_GDeserializer.class)
public class WCH_T_P_G {
    @JacksonXmlProperty(localName = "nil")
    private boolean nil;
    private int intValue;

    @Override
    public String toString() {
        return "WCH_T_P_G{" +
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

    public boolean isNil() {
        return nil;
    }

    public void setNil(boolean nil) {
        this.nil = nil;
    }
}
