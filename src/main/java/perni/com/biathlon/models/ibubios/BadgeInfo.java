package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

public class BadgeInfo {
    @JacksonXmlProperty(localName = "Code")
    private String Code;
    @JacksonXmlProperty(localName = "Description")
    private String Description;
    @JacksonXmlProperty(localName = "Value")
    private String Value;

    @Override
    public String toString() {
        return "BadgeInfo{" +
                "Code='" + Code + '\'' +
                ", Description='" + Description + '\'' +
                ", Value=" + Value +
                '}';
    }

    public BadgeInfo() {}
    public BadgeInfo(String code, String description, String value) {
        Code = code;
        Description = description;
        Value = value;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}
