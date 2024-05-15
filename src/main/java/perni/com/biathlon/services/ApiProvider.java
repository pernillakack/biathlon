package perni.com.biathlon.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import perni.com.biathlon.models.XMLToObject;
import perni.com.biathlon.models.ibubios.CISBiosResponse;
import perni.com.biathlon.models.ibubios.CISBiosValue;
import perni.com.biathlon.models.ibubios.Root;
import reactor.core.publisher.Mono;

@Service
public class ApiProvider {

    private final WebClient webClient;
    private final XMLToObject xmlToObject;
    private final Logger logger = LoggerFactory.getLogger(ApiProvider.class);

    public ApiProvider(WebClient.Builder webClientBuilder, XMLToObject xmlToObject) {
        this.webClient = webClientBuilder.baseUrl("https://biathlonresults.com/modules/sportapi/api").build();
        this.xmlToObject = xmlToObject;
    }

    public Mono<CISBiosResponse> getBio() {
        return webClient.get()
                .uri("/CISBios?IBUId=BTSWE20211199501")
                .accept(MediaType.APPLICATION_XML)
                .retrieve()
                .bodyToMono(String.class)
                .doOnNext(root -> {
                    logger.info("Mottagen XML-data: {}", root);
                })
                .map(xmlToObject::convertXmlToObject);

    }
}
