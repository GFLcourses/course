package Facade.service.impl;

import Facade.service.WebParser;

public class WebPageParser implements WebParser {

    @Override
    public String ParsePage(String http) {
        return "Parsed data from " + http;
    }
}
