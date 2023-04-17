import java.text.NumberFormat;

class Cbrt implements Function {

    private final Function f;
    public Cbrt(Function f) {
        this.f = f;
    }

    public double evaluate(double x) {
        return Math.cbrt(f.evaluate(x));
    }

    public Function derivative() {
        return new Product(new Pow(new Product(new Constant(3), new Pow( new Cbrt(f),2)),-1),f.derivative());
    }

    @Override
    public String toPrettyString(NumberFormat nf){
        return "cbrt(" + f.toPrettyString(nf) + ")";
    }

}
