package perni.com.biathlon.models.ibubios;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;


@JacksonXmlRootElement(localName = "CISBiosValue")
public class CISBiosValue {
        @JacksonXmlProperty(localName = "Description")
        private String Description;
        @JacksonXmlProperty(localName = "Value")
        private String Value;
        @JacksonXmlProperty(localName = "Id")
        private String Id;

        @Override
        public String toString() {
                return "CISBiosValue{" +
                        "Description='" + Description + '\'' +
                        ", Value='" + Value + '\'' +
                        ", Id='" + Id + '\'' +
                        '}';
        }

        public CISBiosValue(){}
        public CISBiosValue(String value){}

        public CISBiosValue(String description, String value, String id) {
                Description = description;
                Value = value;
                Id = id;
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

        public String getId() {
                return Id;
        }

        public void setId(String id) {
                Id = id;
        }
}
