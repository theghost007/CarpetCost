package com.company;

public class RoomCarpet {
    private  RoomDimension roomDimension;
    private  double costOfCarpet;

    public RoomCarpet(RoomDimension roomDimension,double costOfCarpet){
        this.roomDimension=roomDimension;
        this.costOfCarpet=costOfCarpet;
    }
    public double totalCost(){
        return costOfCarpet*roomDimension.getArea();
    }

    @Override
    public String toString() {
        return "RoomCarpet [RoomDimension="+roomDimension+"+ costOfCarpet "+costOfCarpet+" ="+totalCost();
    }
}
