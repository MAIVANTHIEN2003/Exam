package Baithi;
public class Complex {
    public Double realPart;
    public Double virtualPart;

    public Double getRealPart() {
        return realPart;
    }

    public void setRealPart(Double realPart) {
        this.realPart = realPart;
    }

    public Double getVirtualPart() {
        return virtualPart;
    }

    public void setVirtualPart(Double virtualPart) {
        this.virtualPart = virtualPart;
    }

    public Complex(){
        realPart = Double.valueOf(0);
        virtualPart = Double.valueOf(0);
    }

    public Complex(Double realPart, Double virtualPart){
        this.realPart = realPart;
        this.virtualPart = virtualPart;
    }

    public Complex(double temprealPart,  double tempvirtualPart){
        realPart = Double.valueOf(temprealPart);
        virtualPart = Double.valueOf(tempvirtualPart);

    }

    public Complex add(Complex a1, Complex b1){
        Complex te = new Complex();
        te.realPart = a1.realPart + b1.realPart;
        return te;
    }

    public Complex subtract(Complex a1, Complex b1){
        Complex te = new Complex();
        te.realPart = a1.realPart - b1.realPart;
        te.virtualPart = a1.virtualPart - b1.virtualPart;
        return te;
    }

    public Complex multiply (Complex a1, Complex b1){
        Complex te = new Complex();
        te.realPart = a1.realPart * b1.realPart;
        te.virtualPart = a1.virtualPart * b1.virtualPart;
        return te;
    }

    public Complex divide(Complex a1, Complex b1){
        Complex te = new Complex();
        te.realPart = a1.realPart / b1.realPart;
        te.virtualPart = a1.virtualPart / b1.virtualPart;
        return te;
    }


    public void In(){
        System.out.println("In ra man hinh: "+realPart + "+" + virtualPart+ "i");

    }
}
