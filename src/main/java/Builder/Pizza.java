package Builder;

public class Pizza {
    private int size;
    private int sausage;
    private int olives;
    private int pepperoni;
    private int mushrooms;
    private int tomatoPaste;
    private int alfredoSauce;
    private int sauceBBQ;
    private int mozzarella;
    private int parmesan;
    private int bergaderBlue;

    public Pizza(Builder builder) {
        this.size = builder.size;
        this.sausage = builder.sausage;
        this.olives = builder.olives;
        this.pepperoni = builder.pepperoni;
        this.mushrooms = builder.mushrooms;
        this.tomatoPaste= builder.tomatoPaste;
        this.alfredoSauce = builder.alfredoSauce;
        this.sauceBBQ = builder.sauceBBQ;
        this.mozzarella = builder.mozzarella;
        this.parmesan = builder.parmesan;
        this.bergaderBlue = builder.bergaderBlue;

    }

    public int getSize() {
        return size;
    }

    public int getSausage() {
        return sausage;
    }

    public int getOlives() {
        return olives;
    }

    public int getPepperoni() {
        return pepperoni;
    }

    public int getMushrooms() {
        return mushrooms;
    }

    public int getTomatoPaste() {
        return tomatoPaste;
    }

    public int getAlfredoSauce() {
        return alfredoSauce;
    }

    public int getSauceBBQ() {
        return sauceBBQ;
    }

    public int getMozzarella() {
        return mozzarella;
    }

    public int getParmesan() {
        return parmesan;
    }

    public int getBergaderBlue() {
        return bergaderBlue;
    }

    @Override
    public String toString() {
        return "Состав пиццы{" +
                "Размер пиццы = " + size +
                ", колбаски = " + sausage +
                ", оливки = " + olives +
                ", колбаса = " + pepperoni +
                ", грибы = " + mushrooms +
                ", томатная паста = " + tomatoPaste +
                ", соус Альфредо = " + alfredoSauce +
                ", соус барбекью = " + sauceBBQ +
                ", моцарела = " + mozzarella +
                ", пармезан = " + parmesan +
                ", дорблю = " + bergaderBlue +
                '}';
    }

    public static class Builder{

    private int size;
    private int sausage;
    private int olives;
    private int pepperoni;
    private int mushrooms;
    private int tomatoPaste;
    private int alfredoSauce;
    private int sauceBBQ;
    private int mozzarella;
    private int parmesan;
    private int bergaderBlue;

        public Builder(int size) {
            this.size = size;
        }


        public Builder setSausage(int sausage) {
            this.sausage = sausage;
            return this;
        }

        public Builder setOlives(int olives) {
            this.olives = olives;
            return this;
        }

        public Builder setPepperoni(int pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public Builder setMushrooms(int mushrooms) {
            this.mushrooms = mushrooms;
            return this;
        }

        public Builder setTomatoPaste(int tomatoPaste) {
            this.tomatoPaste = tomatoPaste;
            return this;
        }

        public Builder setAlfredoSauce(int alfredoSauce) {
            this.alfredoSauce = alfredoSauce;
            return this;
        }

        public Builder setSauceBBQ(int sauceBBQ) {
            this.sauceBBQ = sauceBBQ;
            return this;
        }

        public Builder setMozzarella(int mozzarella) {
            this.mozzarella = mozzarella;
            return this;
        }

        public Builder setParmesan(int parmesan) {
            this.parmesan = parmesan;
            return this;
        }

        public Builder setBergaderBlue(int bergaderBlue) {
            this.bergaderBlue = bergaderBlue;
            return this;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }
}


