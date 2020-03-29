package es.vass.jos.tdd.controller;

import es.vass.jos.tdd.service.GodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GodsController {

    @Autowired
    private GodsService godsService;

    @GetMapping(params = "startWith")
    public Integer getSumOfGodsStartWith(final String startWith) {
        return godsService.toDigitNameStartWith(startWith);
    }
}
