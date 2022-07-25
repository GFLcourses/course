package Builder;

public class Pizza {
    private int cheese;
    private int sausage;
    private int olives;
    private int tomato;

    private Pizza(){}

    public static class Builder{
        private Pizza pizza = new Pizza();

        public Builder cheese(int value){
            pizza.cheese = value;
            return this;
        }

        public Builder sausage(int value){
            pizza.sausage = value;
            return this;
        }

        public Builder olives(int value){
            pizza.olives = value;
            return this;
        }

        public Builder tomato(int value){
            pizza.tomato = value;
            return this;
        }

        public Pizza build(){
            return pizza;
        }
    }

    @Override
    public String toString() {
        return "Builder.Pizza with " + cheese + " cheese " + sausage + " sausage "  + olives + " olives "  + tomato + " tomato" ;
    }
}
