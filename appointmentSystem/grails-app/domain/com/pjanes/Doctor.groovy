package com.pjanes

class Doctor {

    String doctorName
    String qualification
    String position
    String doctorEmail
    String password
    String doctorOffice
    String doctorPhone
    String bio

    String toString()
    {

        return doctorName + qualification + position
    }

    static constraints = {

        doctorName(size 1..100)
        qualification(size 1..100)
        position(size 1..100)
        doctorEmail(size 1..100)
        password(size 1..100)
        doctorOffice(size 1..100)
        doctorPhone(size 1..100)
        bio(size 1..1000)
    }

    static hasMany = [prescriptions: Prescription, appointments: Appointment]
    static belongsTo = [surgery: Surgery]
}
