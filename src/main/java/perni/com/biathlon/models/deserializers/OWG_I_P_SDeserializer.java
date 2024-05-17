package perni.com.biathlon.models.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import perni.com.biathlon.models.ibubios.OWG_I_P_S;

import java.io.IOException;

public class OWG_I_P_SDeserializer extends JsonDeserializer<OWG_I_P_S> {
    @Override
    public OWG_I_P_S deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        OWG_I_P_S all_owg = new OWG_I_P_S();
        try {
            int intValue = Integer.parseInt(value);
            all_owg.setIntValue(intValue);
        } catch (Exception e) {
            boolean booleanValue = Boolean.parseBoolean(value);
            all_owg.setNil(booleanValue);
        }
        return all_owg;
    }
}
