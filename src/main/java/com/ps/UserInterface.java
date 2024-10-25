package com.ps;

public class UserInterface
{
    //private static Dealership dealership
    private static Dealership dealership;

    public static void init(){
        System.out.println("Init Method");
        dealership = DealershipFileManager.getDealership();
        //loading dealership and inventory from file
    }
    public static void display(){
        init();
        DealershipFileManager.saveDealership(dealership);
        System.out.println("Display Menu");
            //load menu
    }
}
