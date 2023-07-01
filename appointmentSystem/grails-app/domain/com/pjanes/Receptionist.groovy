package com.pjanes

class Receptionist {

    String recepName
    String recepEmail
    String recepUsername
    String recepPasssword
    String recepPhone

    static constraints = {

        recepName(size 1..100)
        recepEmail(size 1..100)
        recepUsername(size 1..100)
        recepPasssword(size 1..100)
        recepPhone(size 1..100)

    }
}
