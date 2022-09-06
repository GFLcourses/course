package Facade;

import Facade.service.impl.DataAnalyzerGeneric;
import Facade.service.impl.WebPageParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FacadeTest {

    public final String EXPECTED = "Successfully analyzed data from Parsed data from https://google.com/";
    public final String HTTP = "https://google.com/";

    @Test
    public void testFacade(){
        WebPageParser webPageParser = new WebPageParser();
        DataAnalyzerGeneric dataAnalyzer = new DataAnalyzerGeneric();

        String actual = new Facade(webPageParser, dataAnalyzer).getAnalyzedData(HTTP);

        assertEquals(EXPECTED, actual);
    }
}