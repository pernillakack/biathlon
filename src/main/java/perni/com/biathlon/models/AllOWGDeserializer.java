package perni.com.biathlon.models;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import perni.com.biathlon.models.ibubios.All_OWG;

import java.io.IOException;

public class AllOWGDeserializer extends JsonDeserializer<All_OWG> {
    @Override
    public All_OWG deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String value = jsonParser.getText();
            try {
                boolean booleanValue = Boolean.parseBoolean(value);
                All_OWG all_owg = new All_OWG();
                all_owg.setValue(booleanValue);
                return all_owg;
            } catch (NumberFormatException e) {
                try {
                    int intValue = Integer.parseInt(value);
                    All_OWG all_owg = new All_OWG();
                    all_owg.setValue(intValue);
                    return all_owg;
                } catch (NumberFormatException ex) {
                    throw new IllegalArgumentException("Ej godkänt värde för All_OWG: " + value);
                }
            }
    }
}
