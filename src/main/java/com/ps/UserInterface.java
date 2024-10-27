package com.ps;
import java.util.*;

public class UserInterface
{
    //private static Dealership dealership
    private static Dealership dealership;

    public static Scanner commandScanner = new Scanner(System.in);
    public static Scanner inputScanner = new Scanner(System.in);

    public static void init(){
        //System.out.println("Init Method");
        dealership = DealershipFileManager.getDealership();
        //loading dealership and inventory from file
    }
    public static void display(){

        //loading Dealership
        init();
        DealershipFileManager.saveDealership(dealership);
        //System.out.println("Display Menu");
        loadMenu();
    }

    public static void loadMenu()
    {
        int command;

        //load menu
        do {
            System.out.println("Welcome to the Dealership");
            System.out.println("What do you want to do?\n" +
                    "1) Get Vehicles by price\n" +
                    "2) Get Vehicles by Make and Model\n" +
                    "3) Get Vehicles by Year\n" +
                    "4) Get Vehicles by Color\n" +
                    "5) Get Vehicles by Mileage\n" +
                    "6) Get Vehicles by Type\n" +
                    "7) View All Vehicles\n" +
                    "8) Add Vehicle\n" +
                    "9) Remove Vehicle\n" +
                    "0) Exit Dealership\n" +
                    "Command: ");
            command = commandScanner.nextInt();

            switch (command){
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid command");
            }

        }while(command != 0);
    }

    private static void displayVehicles(List<Vehicle>vehicles)
    {
        for (Vehicle vehicle : vehicles){
            System.out.println(vehicle);
        }

    }

    public static void processGetByPriceRequest(){
        System.out.println("Imma hit you later, my intellaJ version swapped");

    }

    public static void processGetByMakeModelRequest(){

    }

    public static void processGetByYearRequest(){

    }

    public static void processGetByColorRequest(){

    }

    public static void processGetByMileageRequest(){

    }

    public static void processGetByVehicleTypeRequest(){

    }

    public static void processGetAllVehiclesRequest(){

        //dealership.getAllVehicles();
        System.out.println("Displaying all vehicles");
        //System.out.println(dealership.getAllVehicles());

        List<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);

    }

    public static void processAddVehicleRequest(){

    }

    public static void processRemoveVehicleRequest(){

    }


}