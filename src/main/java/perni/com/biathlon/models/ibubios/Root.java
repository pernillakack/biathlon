package perni.com.biathlon.models.ibubios;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
    public CISBiosResponse CISBiosResponse;
    public String xsi;
    public String text;
}
