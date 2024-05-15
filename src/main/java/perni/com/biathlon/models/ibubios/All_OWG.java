package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import perni.com.biathlon.models.AllOWGDeserializer;

@JacksonXmlRootElement(localName = "All_OWG")
@JsonDeserialize(using = AllOWGDeserializer.class)
public class All_OWG {
    private Object value;

    @Override
    public String toString() {
        return "All_OWG{" +
                "value=" + value +
                '}';
    }

    public All_OWG(){}

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
