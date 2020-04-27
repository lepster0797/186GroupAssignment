package com.groupAssignment;

public class Computer implements CharSequence
{
    public String ID;
    public double process;
    public String ram;
    public String disk;
    public double price;

    //constructor sets the default values
    public Computer()
    {
        ID = "Unassigned";
        process = 0.0;
        ram = "Unassigned";
        disk = "Unassigned";
        price = 0.0;
    }


    //setters : assigns the value from input
    void setID (String _id)
    {
        ID = _id;
    }
    void setProcess (double _Process)
    {
        process = _Process;
    }
    void setRam (String _Ram)
    {
        ram = _Ram;
    }
    void setDisk (String _Disk)
    {
        disk = _Disk;
    }
    void setPrice (double _Price)
    {
        price = _Price;
    }

    //Getters : returns the value of inputs
    String getID()
    {
        return ID;
    }
    double getProcess()
    {
        return process;
    }
    String getRam()
    {
        return ram;
    }
    String getDisk()
    {
        return disk;
    }
    double getPrice()
    {
        return price;
    }

    //takes all the information and puts it in a print method
    void displayComputer()
    {
        System.out.println("Computer ID: " + getID());
        System.out.println("Processor Speed: " + getProcess());
        System.out.println("RAM: " + getRam());
        System.out.println("Harddisk: " + getDisk());
        System.out.println("Price: " + getPrice());
    }

    //everything under here is so that the CharSequence class works properly
    //this is so that the class can be passed towards the Save class
    public int length() {
        return toString().length();
    }
    public char charAt(int index) {
        return toString().charAt(index);
    }
    public CharSequence subSequence(int start, int end) {
        return toString().subSequence(start, end);
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////


    //Override the toString method to make the format of data shown in the text file :D
    public String toString() {
        return "Computer ID [id=" + ID + ", Processor=" + process + ", ram=" + ram + ", disk=" + disk + ", price=" + price ;
    }

}