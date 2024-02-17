import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args){
        List<Ship> info = new ArrayList<>();
        info.add(new Ship("Titanic","1909"));
        info.add(new CruiseShip("Mayflower","1609", 102));
        info.add(new CargoShip("The Queen Mary","1930",2081));

        for(Ship s: info){
           s.print();
        }

    }
}
class Ship{
    private String ship;
    private String yrBuilt;

    public void setShip(String ship) {
        this.ship = ship;
    }
    public String getShip(){
        return ship;
    }

    public void setYrBuilt(String yrBuilt){
        this.yrBuilt = yrBuilt;
    }
    public String getYrBuilt(){
        return yrBuilt;
    }

    public Ship(String ship, String yrBuilt){
        this.setShip(ship);
        this.setYrBuilt(yrBuilt);

    }

    public void print(){
        System.out.println("Ship: "+ getShip() + " |Year Built: " + getYrBuilt());
    }
}
class CruiseShip extends Ship{
    private int maxPass;
    public int getMaxPass() {
        return maxPass;
    }
    public void setMaxPass(int maxPass) {
        this.maxPass = maxPass;
    }
    @Override
    public void print(){
        System.out.println("Ship: " + getShip()+ " |Max Passengers: " + getMaxPass());
    }

    public CruiseShip(String ship,String yrBuilt, int maxPass){
       super(ship,yrBuilt);
       this.setMaxPass(maxPass);

    }

}
class CargoShip extends Ship{

    private int cargoCap;
    public int getCargoCap() {
        return cargoCap;
    }
    public void setCargoCap(int cargoCap) {
        this.cargoCap = cargoCap;
    }
    @Override
    public void print(){
        System.out.println("Ship: " + getShip()+ " |Cargo Capacity: " + getCargoCap());
    }

    public CargoShip(String ship, String yrBuilt, int cargoCap){
        super(ship,yrBuilt);
        this.setCargoCap(cargoCap);
    }
}
