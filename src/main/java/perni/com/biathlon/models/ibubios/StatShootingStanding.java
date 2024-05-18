package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import perni.com.biathlon.models.deserializers.StringListDeserializer;

import java.util.List;
@JacksonXmlRootElement(localName = "StatShootingStanding")
public class StatShootingStanding {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "string")
    private List<String> string;

    @Override
    public String toString() {
        return "StatShootingStanding{" +
                "string=" + string +
                '}';
    }

    public StatShootingStanding(){}
    public StatShootingStanding(List<String> string) {
        this.string = string;
    }

    public List<String> getString() {
        return string;
    }

    public void setString(List<String> string) {
        this.string = string;
    }
}
