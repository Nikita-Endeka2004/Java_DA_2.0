import java.text.NumberFormat;
class Sinh implements Function {
    private final Function f;

    public Sinh(Function f) {
        this.f = f;
    }

    public double evaluate(double x) {
        return Math.sinh(f.evaluate(x));
    }

    public Function derivative() {
        return new Product(new Cosh(f), f.derivative());
    }

    public String toPrettyString(NumberFormat nf) {
        return "sinh(" + f.toPrettyString(nf) + ")";
    }
}
