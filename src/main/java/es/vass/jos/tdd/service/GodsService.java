package es.vass.jos.tdd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GodsService {

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

    public Map<String, String> toDigitNameStartWith(final String startWith) {
        Map<String, String> listOfNames = new HashMap<String, String>();
        listOfNames.put(startWith, toDecimalValue(startWith));

        return listOfNames;
    }

    private String toDecimalValue(final String text) {
        StringBuffer sb = new StringBuffer();

        return sb.toString();
    }
}
