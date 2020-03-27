package es.vass.jos.tdd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GodsService<RestTemplate> {

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getRomansGods() {
        return new ArrayList<String>();
    }

    public List<String> getGreeksGods() {
        return new ArrayList<String>();
    }

    public List<String> getNordicsGods() {
        return new ArrayList<String>();
    }

    public String toDigitNameStartWith(final String startWith) {
        return null;
    }
}
