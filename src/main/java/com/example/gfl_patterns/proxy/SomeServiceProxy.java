package com.example.gfl_patterns.proxy;

public class SomeServiceProxy implements SomeLogicInterface {

    private final SomeService someService;

    public SomeServiceProxy(SomeService someService) {
        this.someService = someService;
    }

    @Override
    public String someLogic() {
        return this.someService.changeAttribute() + ", and some new logic...";
    }
}
