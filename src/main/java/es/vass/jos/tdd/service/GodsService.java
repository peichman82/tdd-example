package es.vass.jos.tdd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Service
public class GodsService {

    @Autowired
    private RestTemplate restTemplate;

    public List<String> getRomansGods() {
        return restTemplate.getForObject("https://my-json-server.typicode.com/jabrena/latency-problems/roman", List.class);
    }

    public List<String> getGreeksGods() {
        return restTemplate.getForObject("https://my-json-server.typicode.com/jabrena/latency-problems/greek", List.class);
    }

    public List<String> getNordicsGods() {
        return restTemplate.getForObject("https://my-json-server.typicode.com/jabrena/latency-problems/nordic", List.class);
    }

    public Integer toDigitNameStartWith(final String startWith) {
        Integer total = 0;

        Map<String, String> listOfNames = new HashMap<String, String>();
        // Get the values
        Stream.of(this.getRomansGods(), this.getGreeksGods(), this.getNordicsGods())
                .flatMap(Collection::stream)
                .distinct()
                .filter(name -> name.startsWith(startWith))
                .forEach(name -> listOfNames.put(name, toDecimalValue(name)));

        // Get the values
        for (Map.Entry<String, String> entry : listOfNames.entrySet()) {
            for (char c : entry.getValue().toCharArray()) {
                total += Character.getNumericValue(c);
            }
        }

        return total;
    }

    private String toDecimalValue(final String text) {
        StringBuffer sb = new StringBuffer();
        char ch[] = text.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            int asciiOf = (int) ch[i];
            sb.append(asciiOf);
        }

        return sb.toString();
    }
}
