package ru.digilleague.company;

public class Boeing extends Company {
    private double salary;

    public Boeing(int salary){
        super("Boeing", "Mr. Uknown");
        this.salary = salary;
    }

    public void aboutCompany(){
        System.out.println("name: " + super.name + " founder: " + founder + " salary: " + salary );
    }
}
