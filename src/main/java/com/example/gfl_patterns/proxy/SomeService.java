package com.example.gfl_patterns.proxy;

public class SomeService implements SomeLogicInterface {

    private final String someAttribute;

    public SomeService(String someAttribute) {
        this.someAttribute = someAttribute;
    }

    public String changeAttribute() {
        return this.someAttribute.toUpperCase().replace('A', '@');
    }

    @Override
    public String someLogic() {
        return changeAttribute() + ", and some logic...";
    }
}
