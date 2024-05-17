package perni.com.biathlon.models.deserializers;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import perni.com.biathlon.models.ibubios.All_OWG;
import perni.com.biathlon.models.ibubios.WCH_T_P_G;

import java.io.IOException;

public class All_OWGDeserializer extends JsonDeserializer<All_OWG> {
    @Override
    public All_OWG deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        All_OWG all_owg = new All_OWG();
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
