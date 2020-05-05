package com.groupAssignment;


//This class inherits from the Computer class
public class Desktop extends Computer
{
    public String monitor;

    //constructor
    public Desktop()
    {
        monitor = "Unassigned";
    }

    //Setter : Assigns the monitor type
    void setMonitor (String _Monitor)
    {
        monitor = _Monitor;
    }

    //Getter : Returns the monitor type
    String getMonitor()
    {
        return monitor;
    }

    //takes all the information and puts it in a print method
    void displayComputer() {
        System.out.println("Computer ID: " + getID());
        System.out.println("Processor Speed: " + getProcess());
        System.out.println("RAM: " + getRam());
        System.out.println("Harddisk: " + getDisk());
        System.out.println("Monitor Type: " + getMonitor());
        System.out.println("Price: " + getPrice());
    }

    //overrides the toString method
    public String toString() {
        return "Desktop\n{"+"\n\tID: " + ID + "\n\tPROCESSOR: " + process + "\n\tRAM: " + ram + "\n\tDISK: " + disk +"\n\tMONITOR: "+ monitor + "\n\tPRICE: " + price +"\n\n}";
    }
    }
