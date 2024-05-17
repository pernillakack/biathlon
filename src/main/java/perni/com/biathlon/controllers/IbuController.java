package perni.com.biathlon.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import perni.com.biathlon.models.BioModel;
import perni.com.biathlon.models.XMLToObject;
import perni.com.biathlon.models.ibubios.CISBiosResponse;
import perni.com.biathlon.models.ibubios.Root;
import perni.com.biathlon.services.ApiProvider;
import reactor.core.publisher.Mono;

@Controller
public class IbuController {

    private final BioModel bioModel;
    private final ApiProvider apiProvider;
    private final XMLToObject xmlToObject;
    private final Logger logger = LoggerFactory.getLogger(IbuController.class);

    public IbuController(BioModel bioModel, ApiProvider apiProvider, XMLToObject xmlToObject) {
        this.bioModel = bioModel;
        this.apiProvider = apiProvider;
        this.xmlToObject = xmlToObject;
    }


    @GetMapping("/athlete")
    public Mono<String> getAthlete(@RequestParam String IBUId, Model model ) {
        return apiProvider.getBio(IBUId)
                .doOnNext(root ->{
                    logger.info("Converted xml-data: {}", root.toString());
                    model.addAttribute("root", root);
                })
                .thenReturn("athlete");
    }
    @GetMapping("/")
    public String getHome() {
        return "home";
    }

}

