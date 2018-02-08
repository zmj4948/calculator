public class calculator {
    private double accumulator;

    public calculator() {
        this.accumulator = 0.0;
    }

    public void setAccumulator(double accumulator) {
        this.accumulator = accumulator;
    }
    public double add(double number){
        return this.accumulator+=number;
    }
    public double subtract(double number){
        return this.accumulator-=number;
    }
    public double multiply(double number){
        return this.accumulator*=number;
    }
    public double divide(double number){
        return this.accumulator/=number;
    }

    @Override
    public String toString() {
        return String.valueOf(accumulator);
    }
}
