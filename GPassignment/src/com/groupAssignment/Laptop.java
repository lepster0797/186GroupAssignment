package com.groupAssignment;

public class Laptop extends Computer
{
    double Weight;

    //constructor
    public Laptop()
    {
        Weight = 0.0;
    }

    //Setter : Assigns the laptops's weight
    void setWeight(double _Weight)
    {
        Weight = _Weight;
    }

    //getter : returns the weight value
    double getWeight()
    {
        return Weight;
    }


    //takes all the information and puts it in a print method
    void displayComputer()
    {
        System.out.println("Computer ID: " + getID());
        System.out.println("Processor Speed: " + getProcess());
        System.out.println("RAM: " + getRam());
        System.out.println("Harddisk: " + getDisk());
        System.out.println("Weight: " + getWeight());
        System.out.println("Price: " + getPrice());
        System.out.println("");
    }

    //overrides toString method
    public String toString() {
        return "Laptop\n{"+"\n\tID: " + ID + "\n\tPROCESSOR: " + process + "\n\tRAM: " + ram + "\n\tDISK: " + disk +"\n\tWEIGHT: "+ Weight + "\n\tPRICE: " + price +"\n\n}";
    }
}
