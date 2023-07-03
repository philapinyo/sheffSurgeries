package com.pjanes

class Appointment {

    Date appDateTime
    int appDuration
    String roomNumber

    String toString()
    {

        return appDateTime + " at " + roomNumber

    }

    static constraints = {

        appDateTime()
        appDuration(size 1..100)
        roomNumber(size 1..100)
    }

    static belongsTo = [surgery: Surgery, doctor: Doctor, nurses: Nurse, patients: Patient]
}
