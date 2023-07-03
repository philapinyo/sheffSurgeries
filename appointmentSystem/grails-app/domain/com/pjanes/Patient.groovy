package com.pjanes

class Patient {

    String patientName
    String patientAddress
    String patientResidence
    Date patientDob
    String patientID
    Date dateRegistered
    String patientPhone

    static constraints = {

        patientName(size: 1..100)
        patientAddress(size: 1..100)
        patientResidence(size: 1..100)
        patientDob()
        patientID(size 5..10)
        dateRegistered()
        patientPhone(size 7..15)

    }

    static hasMany = [appointments: Appointment, prescriptions: Prescription]
    static belongsTo = [surgery: Surgery]
}
