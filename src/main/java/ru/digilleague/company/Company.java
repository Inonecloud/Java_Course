package ru.digilleague.company;

public class Company {
    protected String name;
    protected String founder;

    public Company(String name, String founder) {
        this.name = name;
        this.founder = founder;

      makeMoney(name);
    }

    @Override
    public String toString() {
        return  "name: " + name + " founder: " + founder;
    }


    private void makeMoney(String name){
        System.out.println("This company Make money");
    }
}
