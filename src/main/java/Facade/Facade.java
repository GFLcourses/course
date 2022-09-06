package Facade;

import Facade.service.DataAnalyzer;
import Facade.service.WebParser;

public class Facade {

    private DataAnalyzer dataAnalyzer;
    private WebParser webParser;

    public Facade(WebParser webParser, DataAnalyzer dataAnalyzer) {
        this.dataAnalyzer = dataAnalyzer;
        this.webParser = webParser;
    }

    public String getAnalyzedData(String http) {

        String parsedPage = webParser.ParsePage(http);
        String analyzed = dataAnalyzer.analyze(parsedPage);

        return analyzed;
    }
}
