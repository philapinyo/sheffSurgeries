package com.pjanes

class Nurse {

    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone

    String toString()
    {

        return nurseName

    }

    static constraints = {

        nurseName(size 1..100)
        qualifications(size 1..100)
        nurseEmail(size 1..100)
        nurseOffice(size 1..100)
        nursePhone(size 1..100)
        
    }

    static hasMany = [appointments: Appointment]
    static belongsTo = [surgery: Surgery]
}
