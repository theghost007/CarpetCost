package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//    final double CARPET_PRICE_PER_SQFT=8.0;
//	  Scanner sc=new Scanner(System.in);
		System.out.println("This program will display the carpet cost of the given area "+
				"\n"+"enter the lengths in feet"+"\n");

//		System.out.println("enter the length of the field");
//        double length=sc.nextDouble();
//
//		System.out.println("enter the width of the field");
//		double width=sc.nextDouble();
//	    sc.close();
//		RoomDimension roomDimension=new RoomDimension(length,width);
//		RoomCarpet roomCarpet=new RoomCarpet(roomDimension,CARPET_PRICE_PER_SQFT);
		RoomDimension roomDimension=new RoomDimension(5,6);
		RoomCarpet roomCarpet=new RoomCarpet(roomDimension,5);

		System.out.println(roomCarpet);
    }
}
