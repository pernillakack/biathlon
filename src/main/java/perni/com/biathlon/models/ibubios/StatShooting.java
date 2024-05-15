package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import perni.com.biathlon.models.StringListDeserializer;

import java.util.List;
@JacksonXmlRootElement(localName = "StatShooting")
public class StatShooting {
    @JacksonXmlProperty(localName = "string")
    @JsonDeserialize(using = StringListDeserializer.class)
    private List<String> string;

    @Override
    public String toString() {
        return "StatShooting{" +
                "string=" + string +
                '}';
    }

    public StatShooting(){}
    public StatShooting(List<String> string) {
        this.string = string;
    }

    public List<String> getString() {
        return string;
    }

    public void setString(List<String> string) {
        this.string = string;
    }
}
