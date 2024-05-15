package perni.com.biathlon.models;

import org.springframework.stereotype.Component;
import perni.com.biathlon.models.ibubios.Root;
import perni.com.biathlon.services.ApiProvider;
import reactor.core.publisher.Mono;
@Component
public class BioModel {

    private final ApiProvider apiProvider;
    private String id;
    private String name;

    public BioModel(ApiProvider apiProvider) {
        this.apiProvider = apiProvider;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
