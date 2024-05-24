package perni.com.biathlon.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import perni.com.biathlon.models.ibubios.CISBiosResponse;
import perni.com.biathlon.services.ApiProvider;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class IbuController {
    private final ApiProvider apiProvider;
    private final Logger logger = LoggerFactory.getLogger(IbuController.class);

    public IbuController(ApiProvider apiProvider) {
        this.apiProvider = apiProvider;
    }

    @GetMapping("/charts")
    public Mono<String> getStats(Model model) {
        List<String> ibuIds = Arrays.asList(
                "BTSWE22602199901", "BTSWE22706199401", "BTSWE23103199501", "BTSWE12803199701", "BTSWE10809199501",
                "BTSWE22207200001", "BTSWE22210199901", "BTSWE21301200301", "BTSWE12701200101", "BTSWE12503199701",
                "BTSWE10404200001", "BTSWE10807199901", "BTSWE20211199501");

        List<Mono<CISBiosResponse>> results = ibuIds.stream()
                .map(apiProvider::getBio)
                .collect(Collectors.toList());

        return Mono.zip(results, Arrays::asList)
                .doOnNext(roots -> {
                    model.addAttribute("biathletes", roots);
                    logger.info("Fetched data for all biathletes: {}", roots);
                })
                .thenReturn("charts");
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

