package org.javaturk.jp.ch05.hospital;

public class Doctor {
    String id;
    String name;
    String field;
    Patient[] patients;

    public Prescription inspect(Patient patient){
        Prescription prescription = null;
        //...
        return prescription;
    }

    public void operate(Patient patient){
        //...
    }
}
