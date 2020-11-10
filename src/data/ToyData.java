package data;

import base.Bike;
import base.Parcel;
import base.ParcelStatus;
import base.Person;
import base.Location;

public class ToyData {

    public static Bike[] getBikes() {
        Bike[] bikes = new Bike[3];
        // your code+

        return bikes;
    }

    public static Person[] getPerson() {
        Person[] person = new Person[3];
        person[0] = new Person("NAPHAT","NUANSRI");
        person[1] = new Person("SUTHIPONG","SHANAMOON");
        person[2] = new Person("CHANANYA","SINPHICHIT");
        // your code
        
        return person;
    }

    public static Parcel[] getParcels() {
        Parcel[] parcels = new Parcel[10];
        parcels[0]=new Parcel(20.0,ParcelStatus.DELIVERED,new Location(13.00, 46.4));
        parcels[1]=new Parcel(15.0,ParcelStatus.SHIPPING,new Location(15.00, 49.8));
        parcels[2]=new Parcel(25.0,ParcelStatus.SHIPPING,new Location(13.90, 43.9));
        parcels[3]=new Parcel(20.0,ParcelStatus.DELIVERED,new Location(16.30, 51.9));
        parcels[4]=new Parcel(20.0,ParcelStatus.DELIVERED,new Location(12.00, 49.9));
        parcels[5]=new Parcel(45.0,ParcelStatus.READY_TO_SHIP,new Location(13.50, 50.0));
        parcels[6]=new Parcel(30.0,ParcelStatus.READY_TO_SHIP,new Location(20.00, 49.9));
        parcels[7]=new Parcel(10.0,ParcelStatus.DELIVERED,new Location(13.20, 49.9));
        parcels[8]=new Parcel(18.0,ParcelStatus.SHIPPING,new Location(17.90, 67.0));
        parcels[9]=new Parcel(20.0,ParcelStatus.DELIVERED,new Location(13.00, 42.0));
        return parcels;
    }

    //testing
    public static void main(String[] args) {
        printBike();
        printPerson();
        printParcels();
    }

    private static void printBike() {
        Bike[] bikes = getBikes();
        for (int i = 0; i < bikes.length; i++) {
            System.out.println(bikes[i].toString());
        }
    }

    private static void printPerson() {
        Person[] person = getPerson();
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i].toString());
        }
    }

    private static void printParcels() {
        Parcel[] percels = getParcels();
        for (int i = 0; i < percels.length; i++) {
            System.out.println(percels[i].toString());
        }
    }

}
