package com.pjanes

class Prescription {

    String prescriptionNumber
    String medicine
    int daysSupply
    String totalCost
    Date dateIssued
    Bool patientPaying

    static constraints = {

        prescriptionNumber(size 1..100)
        medicine(size 1..100)
        daysSupply(size 0..100)
        dateIssued()
        patientPaying()
        
    }
}
