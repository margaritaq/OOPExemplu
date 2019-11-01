package OOPTrening;

public class ElectroCar extends Car {
    @Override
    protected int speed(int a) {
        return a;
    }

    @Override
    protected void fluelTipe() {
        super.fluelTipe();
        System.out.println("electriciti");
    }
}
