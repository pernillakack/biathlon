package perni.com.biathlon.models;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringListDeserializer extends JsonDeserializer {
    @Override
    public List<String> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        List<String> strings =new ArrayList<>();
        if(node.isArray()) {
            for(final JsonNode objNode : node) {
                strings.add(objNode.asText());
            }
        }else{
            strings.add(node.asText());
        }

        return strings;
    }
}
