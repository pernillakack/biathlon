package perni.com.biathlon.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import perni.com.biathlon.models.XMLToObject;
import perni.com.biathlon.models.ibubios.Root;
import perni.com.biathlon.services.ApiProvider;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.net.URISyntaxException;

@Controller
public class IbuController {

    private final IbuRestController ibuRestController;
    private final ApiProvider apiProvider;
    private final XMLToObject xmlToObject;

    public IbuController(IbuRestController ibuRestController, ApiProvider apiProvider, XMLToObject xmlToObject) {
        this.ibuRestController = ibuRestController;
        this.apiProvider = apiProvider;
        this.xmlToObject = xmlToObject;
    }

    @GetMapping("/")
    public String getAthlete( Model model) throws IOException, URISyntaxException {
        Mono<Root> bioMono = apiProvider.getBio();

        bioMono.subscribe(root -> {
            model.addAttribute("athlete", root.CISBiosResponse);

        });

            return "home";


    }
}
