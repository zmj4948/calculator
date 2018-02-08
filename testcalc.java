
public class testcalc {
    public static void main(String[] args){
        calculator mycalc= new calculator();
        double myWeight=250;
        mycalc.add(myWeight);
        mycalc.multiply(0.453852);
        System.out.println("My weight is "+myWeight+" lb= "+mycalc+"kg");
    }
}
