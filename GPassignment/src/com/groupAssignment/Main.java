//AhmadAlifBinJamil-2019437556
//MuhammadHazimBinZamri -2019214966
//MuhhammadIzzatBinJafri -2019270912

package com.groupAssignment;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws IOException {
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

                System.out.println("Please enter Desktop ID: ");
                desktop1.setID (scanner.nextLine());

                System.out.println("Please enter Desktop Processor Speed: ");
                desktop1.setProcess (Double.parseDouble(scanner.nextLine()));

                System.out.println("Please enter Desktop RAM: ");
                desktop1.setRam (scanner.nextLine());

                System.out.println("Please enter Desktop Disk Space: ");
                desktop1.setDisk(scanner.nextLine());

                System.out.println("Please enter Desktop Monitor Type: ");
                desktop1.setMonitor (scanner.nextLine());

                System.out.println("Please enter Desktop Price: ");
                desktop1.setPrice (Double.parseDouble(scanner.nextLine()));
            }
            else if(input.equals("2"))
            {
                Laptop laptop1 = new Laptop();  //creates a new laptop object with user input
                listOfObject.add(laptop1);      //adds the object to the listOfObject List.

                System.out.println("Please enter Laptop ID: ");
                laptop1.setID (scanner.nextLine());

                System.out.println("Please enter Laptop Processor Speed: ");
                laptop1.setProcess (Double.parseDouble(scanner.nextLine()));

                System.out.println("Please enter Laptop RAM: ");
                laptop1.setRam(scanner.nextLine());

                System.out.println("Please enter Laptop Harddisk Space: ");
                laptop1.setDisk(scanner.nextLine());

                System.out.println("Please enter Laptop Weight: ");
                laptop1.setWeight (Double.parseDouble(scanner.nextLine()));

                System.out.println("Please enter Laptop Price: ");
                laptop1.setPrice (Double.parseDouble(scanner.nextLine()));
            }
            else if(input.equals("3"))
            {
                for(Object obj : listOfObject) //loops through the "listOfObject" list.
                {
                    if(obj instanceof Desktop) //loops through all the contents of the list
                    {                            // if it's an instance of the Desktop subclass
                        Desktop d1 = (Desktop)obj;
                        d1.displayComputer();
                        System.out.println(" ");
                    }
                    else if(obj instanceof Laptop) //loops through all contents of the
                    {                               //list if it's an instance of Laptop subclass
                        Laptop l1 = (Laptop)obj;
                        l1.displayComputer();
                        System.out.println(" ");
                    }
                }
            }
            else if(input.equals("4"))
            {
                System.out.println("Which entry do you want to delete? :");
                listOfObject.remove(scanner.nextInt()); //calls the remove method from the List class
            }
            else if(input.equals("5")) //save file
            {
                System.out.println("Please enter file to save : ");
                Save ns = new Save(); //creates a save object to call the safeToFile method
                ns.saveToFile(scanner.nextLine(), listOfObject); //passes a file name and a list

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
