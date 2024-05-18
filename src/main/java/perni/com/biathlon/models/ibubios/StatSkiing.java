package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
@JacksonXmlRootElement(localName = "StatSkiing")
public class StatSkiing {
    @JacksonXmlElementWrapper(useWrapping = false)
    @JacksonXmlProperty(localName = "string")
    private List<String> string;

    @Override
    public String toString() {
        return "StatSkiing{" +
                "string=" + string +
                '}';
    }

    public StatSkiing(){}
    public StatSkiing(List<String> string) {
        this.string = string;
    }

    public List<String> getString() {
        return string;
    }

    public void setString(List<String> string) {
        this.string = string;
    }
}
