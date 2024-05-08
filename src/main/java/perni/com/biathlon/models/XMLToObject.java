package perni.com.biathlon.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Component;
import perni.com.biathlon.models.ibubios.Root;

@Component
public class XMLToObject {
    private final XmlMapper xmlMapper;

    public XMLToObject() {
        this.xmlMapper= new XmlMapper();
    }

    public Root convertXmlToObject(String xmlString) {
        try {
            return xmlMapper.readValue(xmlString, Root.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
