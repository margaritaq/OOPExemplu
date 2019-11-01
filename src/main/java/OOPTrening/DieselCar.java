package OOPTrening;

public class DieselCar extends Car {
    @Override
    public int speed(int a) {
        return super.speed(a);
    }

    @Override
    protected void fluelTipe() {
        super.fluelTipe();
        System.out.println("diesel");
    }
}
