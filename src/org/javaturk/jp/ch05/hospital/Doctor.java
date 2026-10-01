package org.javaturk.jp.ch05.hospital;

class Doctor {
    String id;
    String name;
    String field;
    Patient[] patients;

    Prescription inspect(Patient patient) {
        Prescription prescription = null;
        //...
        return prescription;
    }

    void operate(Patient patient) {
        //...
    }
}
