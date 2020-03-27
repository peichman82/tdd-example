package es.vass.jos.tdd.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@SpringBootTest
public class GodsServiceIntegrationTest {

    @Autowired
    private GodsService godsService;

    @Test
    public void toDigitTest() {

        String result = godsService.toDigitNameStartWith("n");

        verify(godsService, times(1)).getRomansGods();
        verify(godsService, times(1)).getGreeksGods();
        verify(godsService, times(1)).getNordicsGods();
        verify(godsService, times(1)).toDigitNameStartWith("n");
        assertEquals("", result);
    }
}
