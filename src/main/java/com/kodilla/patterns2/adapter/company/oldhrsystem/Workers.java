package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"345235423" , "john" , "smith"},
            {"343254425" , "ivone" , "novak"},
            {"345453255" , "jack" , "london"}
    };
    private double[] salaries = {
            4500.00,
            3700.00,
            9000.00
    };
    public String getWorker(int n){
        if(n > salaries.length){
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " +  workers[n][2] + ", " + salaries[n];
    }
    public String[][] getWorkers(){
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
