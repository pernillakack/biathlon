package perni.com.biathlon.models.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import perni.com.biathlon.models.ibubios.WCH_T_P_G;

import java.io.IOException;

public class WCH_T_P_GDeserializer extends JsonDeserializer<WCH_T_P_G> {
    @Override
    public WCH_T_P_G deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String value = jsonParser.getText();
        WCH_T_P_G wch_t_p_g = new WCH_T_P_G();
            try {
                int intValue = Integer.parseInt(value);
                wch_t_p_g.setIntValue(intValue);
            } catch (Exception e) {
                boolean booleanValue = Boolean.parseBoolean(value);
                wch_t_p_g.setNil(booleanValue);
            }
            return wch_t_p_g;
        }

    }

