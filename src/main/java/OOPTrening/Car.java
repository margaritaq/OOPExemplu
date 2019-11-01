package OOPTrening;

public class Car extends WeeledVehicle {
    @Override
    int weel() {
        return 4;
    }
    protected   int speed(int a){
        return a;
    }
    protected void fluelTipe(){
        System.out.println("tipe: ");
    }
}
