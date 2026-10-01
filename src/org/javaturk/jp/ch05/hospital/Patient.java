package org.javaturk.jp.ch05.hospital;

class Patient {
    // Attributes or properties
    String id;
    String name;
    char sex;
    int age;
    String[] illnesses;
    Doctor doctor;


    // Behaviors or operations
    void takeMedication(Prescription prescription) {
        //...
    }

    void visitedBy(String relative) {
        //...
    }
}
