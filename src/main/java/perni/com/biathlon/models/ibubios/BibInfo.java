package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class BibInfo {
    @JacksonXmlProperty(localName = "Code")
    public String Code;
    @JacksonXmlProperty(localName = "Color")
    public String Color;
    @JacksonXmlProperty(localName = "Description")
    public String Description;

    @Override
    public String toString() {
        return "BibInfo{" +
                "Code='" + Code + '\'' +
                ", Color='" + Color + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    public BibInfo(){}
    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}