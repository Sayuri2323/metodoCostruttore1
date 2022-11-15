package it.develhope.costruttore1;

public class Test {
    public static void main(String[] args) {

        House house1;
        House house2;

        house1=new House();
        house1.address="via fiasella";
        house1.numberOfFloor=2;
        System.out.println(house1.address);
        System.out.println(house1.numberOfFloor);
        house2=new House();
        house2.address="viale glori";
        house2.numberOfFloor=3;
        System.out.println(house2.address);
        System.out.println(house1.numberOfFloor);
    }
}
