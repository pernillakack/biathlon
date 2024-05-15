package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "OWG_O_P_B")
public class OWG_O_P_B {
    @JacksonXmlProperty(localName = "nil")
    private boolean nil;
}
