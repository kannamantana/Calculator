public class IntsCalculator implements Ints {

    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        double total = target.newFormula().addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.SUM).result();
        return (int) total;
    }

    @Override
    public int mult(int arg0, int arg1) {
        double total = target.newFormula().addOperand(arg0).addOperand(arg1)
                .calculate(Calculator.Operation.MULT).result;
        return (int) total;
    }

    @Override
    public int pow(int a, int b) {
        double total = target.newFormula().addOperand(a).addOperand(b)
                .calculate(Calculator.Operation.POW).result;
        return (int) total;
    }
}