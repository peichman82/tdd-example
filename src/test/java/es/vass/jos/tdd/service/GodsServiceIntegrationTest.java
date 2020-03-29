package es.vass.jos.tdd.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GodsServiceIntegrationTest {

    @Autowired
    private GodsService godsService;

    @Test
    public void toDigitTest() {

        Map<String, String> listOfNames = godsService.toDigitNameStartWith("Zeus");

        verify(godsService, times(1)).getRomansGods();
        verify(godsService, times(1)).getGreeksGods();
        verify(godsService, times(1)).getNordicsGods();
        verify(godsService, times(1)).toDigitNameStartWith("Zeus");

        assertEquals("122101117115", listOfNames.get("Zeus"));
    }
}
