package dp.visitor.entity;

import dp.visitor.PvistitorI;

import java.io.PrintStream;

import java.util.Date;

public class PatientEntity {


    private String pName;
    private Integer pBeadNumber;

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public Integer getpBeadNumber() {
        return pBeadNumber;
    }

    public void setpBeadNumber(Integer pBeadNumber) {
        this.pBeadNumber = pBeadNumber;
    }

    public void admit() {
        System.out.println("Patient" + this.getpName() + " Admited " + new Date());
    }

    public void descharge() {
        System.out.println("Patient" + this.getpName() + " Discharge " + new Date());
    }


    public void doCheckup(PvistitorI visitor) {
        visitor.doCheckup();
    }

}
