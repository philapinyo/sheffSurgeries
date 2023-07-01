package com.pjanes

class Appointment {

    Date appDateTime
    int appDuration
    String roomNumber

    static constraints = {

        appDateTime()
        appDuration(size 1..100)
        roomNumber(size 1..100)
    }
}
