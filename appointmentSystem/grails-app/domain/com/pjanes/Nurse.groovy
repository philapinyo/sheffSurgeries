package com.pjanes

class Nurse {

    String nurseName
    String qualifications
    String nurseEmail
    String nurseOffice
    String nursePhone

    static constraints = {

        nurseName(size 1..100)
        qualifications(size 1..100)
        nurseEmail(size 1..100)
        nurseOffice(size 1..100)
        nursePhone(size 1..100)
        
    }
}
