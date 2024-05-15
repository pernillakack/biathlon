package perni.com.biathlon.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import perni.com.biathlon.models.ibubios.CISBiosResponse;
import perni.com.biathlon.models.ibubios.Root;

import java.io.IOException;

@Component
public class XMLToObject {
    private final XmlMapper xmlMapper;
    private final Logger logger = LoggerFactory.getLogger(XMLToObject.class);

    public XMLToObject() {
        this.xmlMapper= new XmlMapper();
    }

    public CISBiosResponse convertXmlToObject(String xmlString) {
        try {
            return xmlMapper.readValue(xmlString, CISBiosResponse.class);
        } catch (IOException e) {
            throw new RuntimeException("Kunde inte parsa från xml till objekt", e);
        }
    }

}
