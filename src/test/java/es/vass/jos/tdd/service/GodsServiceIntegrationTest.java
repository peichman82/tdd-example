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
        Integer totalValue = godsService.toDigitNameStartWith("Z");

        assertEquals(27, totalValue.intValue());
    }
}
