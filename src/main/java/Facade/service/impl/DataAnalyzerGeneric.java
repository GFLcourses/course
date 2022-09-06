package Facade.service.impl;

import Facade.service.DataAnalyzer;

public class DataAnalyzerGeneric implements DataAnalyzer {
    @Override
    public String analyze(String parsedData) {
        return "Successfully analyzed data from " + parsedData;
    }
}
