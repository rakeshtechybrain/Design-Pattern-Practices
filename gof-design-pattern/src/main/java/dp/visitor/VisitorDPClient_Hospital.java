package dp.visitor;

import dp.visitor.entity.PatientEntity;

public class VisitorDPClient_Hospital {

    public static void main(String[] args) {

//hospial hash Autohorities
        PatientEntity patientEntity=new PatientEntity();
        patientEntity.setpName("Akash");
        patientEntity.admit();
        PvistitorI p=new DVisitor();
        patientEntity.doCheckup(p);
        patientEntity.descharge();


    }
}
