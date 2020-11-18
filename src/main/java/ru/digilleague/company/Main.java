package ru.digilleague.company;

public class Main {
    public static void main(String[] args) {
//        Company company = new Company("Digitalleague", "Sergey Shilov");
//        System.out.println(company.toString());

        Company spaceX = new SpaceX();
        System.out.println(spaceX.toString());

        Boeing boeing = new Boeing(10000);
        boeing.aboutCompany();
    }
}
