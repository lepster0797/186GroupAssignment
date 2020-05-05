//AhmadAlifBinJamil-2019437556
//MuhammadHazimBinZamri -2019214966
//MuhhammadIzzatBinJafri -2019270912

package com.groupAssignment;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> listOfObject = new ArrayList<>(); //creates a new List collection called listOfObjects

        //intro
        System.out.println("-------------------------------------------");
        System.out.println("Computer Information Management System v0.1");
        System.out.println("-------------------------------------------");
        
        ////////////////////////////////////////////////////////////////////////////
        do //Loops the program while input does not equal "6"
        {
            //StartMenu
            System.out.println("Menu");
            System.out.println("1. Add new Desktop Information");
            System.out.println("2. Add new Laptop Information");
            System.out.println("3. Display all entries.");
            System.out.println("4. Delete an entry.");
            System.out.println("5. Save progress.");
            System.out.println("6. Quit.");
            System.out.print("Please enter either 1 to 6: ");
            input = scanner.nextLine(); //takes input for the menu choice
            System.out.println(" "); //prints whitespace

            if(input.equals("1"))
            {
                Desktop desktop1 = new Desktop();   //creates a new Desktop object with user input
                listOfObject.add(desktop1);         //adds the object to the listOfObject List.

                try {
                    System.out.print("Please enter Desktop ID: ");
                    desktop1.setID(scanner.nextLine());

                    try {
                        System.out.print("Please enter Desktop Processor Speed: ");
                        desktop1.setProcess(Double.parseDouble(scanner.nextLine()));
                    }catch(Exception e){
                        System.out.println("...");
                        System.out.println("Error");
                        System.out.println("Enter floating point values, characters are prohibited.");
                    }
                    System.out.print("Please enter Desktop RAM: ");
                    desktop1.setRam(scanner.nextLine());

                    System.out.print("Please enter Desktop Disk Space: ");
                    desktop1.setDisk(scanner.nextLine());

                    System.out.print("Please enter Desktop Monitor Type: ");
                    desktop1.setMonitor(scanner.nextLine());

                    try {
                        System.out.print("Please enter Desktop Price: ");
                        desktop1.setPrice(Double.parseDouble(scanner.nextLine()));
                    }catch(Exception e){

                        System.out.println("...");
                        System.out.println("Error");
                        System.out.println("Enter floating point values, characters are prohibited.");
                    }
                }catch(Exception e){
                    System.out.println("...");
                    System.out.println("Error");
                    System.out.println("You can't do that");
                }
            }
            else if(input.equals("2"))
            {
                Laptop laptop1 = new Laptop();  //creates a new laptop object with user input
                listOfObject.add(laptop1);      //adds the object to the listOfObject List.

                try {
                    System.out.print("Please enter Laptop ID: ");
                    laptop1.setID(scanner.nextLine());

                    try {
                        System.out.print("Please enter Laptop Processor Speed: ");
                        laptop1.setProcess(Double.parseDouble(scanner.nextLine()));
                    }catch(Exception e){
                        System.out.println("...");
                        System.out.println("Error");
                        System.out.println("Enter floating point values, characters are prohibited.");
                    }

                    System.out.print("Please enter Laptop RAM: ");
                    laptop1.setRam(scanner.nextLine());

                    System.out.print("Please enter Laptop Harddisk Space: ");
                    laptop1.setDisk(scanner.nextLine());

                    try {
                        System.out.print("Please enter Laptop Weight: ");
                        laptop1.setWeight(Double.parseDouble(scanner.nextLine()));
                    }catch(Exception e){

                        System.out.println("...");
                        System.out.println("Error");
                        System.out.println("Enter floating point values, characters are prohibited.");
                    }

                    try {
                        System.out.print("Please enter Laptop Price: ");
                        laptop1.setPrice(Double.parseDouble(scanner.nextLine()));
                    }catch(Exception e){

                        System.out.println("...");
                        System.out.println("Error");
                        System.out.println("Enter floating point values, characters are prohibited.");
                    }
                }catch(Exception e){
                    System.out.println("...");
                    System.out.println("Error");
                    System.out.println("Enter floating point values, characters are prohibited.");
                }
            }
            else if(input.equals("3"))
            {
                System.out.println("--------------------");
                System.out.println("Current Information");
                System.out.println("--------------------");
                for(Object obj : listOfObject) //loops through the "listOfObject" list.
                {
                    if(obj instanceof Desktop) //loops through all the contents of the list
                    {                            // if it's an instance of the Desktop subclass
                        Desktop d1 = (Desktop)obj;
                        d1.displayComputer();
                       // System.out.println(" ");
                    }
                    else if(obj instanceof Laptop) //loops through all contents of the
                    {                               //list if it's an instance of Laptop subclass
                        Laptop l1 = (Laptop)obj;
                        l1.displayComputer();
                       // System.out.println(" ");
                    }
                    System.out.println(" ");
                }

                System.out.println("--------------------");
                System.out.println("Done");
                System.out.println("--------------------");

            }
            else if(input.equals("4"))
            {
                try {
                    System.out.print("Which entry do you want to delete? :");
                    int size = scanner.nextInt();
                    listOfObject.remove(size-1); //calls the remove method from the List class
                }catch (Exception e){
                    System.out.println("...");
                    System.out.println("Error!");
                    System.out.println("That entry doesnt exist.");
                }
            }
            else if(input.equals("5")) //save file
            {
                try {
                    System.out.print("Please enter file to save : ");
                    Save.saveToFile(scanner.nextLine(), listOfObject);
                }catch (Exception e){
                    System.out.println("...");
                    System.out.println("Error!");
                    System.out.println("Enter a valid name!");
                }
            }
            else if(!input.equals("6"))
            {
                System.out.println(" ");
                System.out.println("Invalid Operation!");
                System.out.println("Please enter 1 to 6!");
                System.out.println(" ");

            }
            System.out.println(" "); //prints whitespace

        }while(!input.equals("6")); //Quits when input is 6.

    }
}
