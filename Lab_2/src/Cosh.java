import java.text.NumberFormat;
class Cosh implements Function {
    private final Function f;

    public Cosh(Function f) {
        this.f = f;
    }

    public double evaluate(double x) {
        return Math.cosh(f.evaluate(x));
    }

    public Function derivative() {
        return new Product(new Sinh(f), f.derivative());
    }

    public String toPrettyString(NumberFormat nf) {
        return "Cosh(" + f.toPrettyString(nf) + ")";
    }
}
