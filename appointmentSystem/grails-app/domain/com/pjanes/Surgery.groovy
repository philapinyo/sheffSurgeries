package com.pjanes

class Surgery {

    String name
    String address 
    String postcode
    String telephone
    int numberOfPatients
    String description
    String openingTime
    boolean registeringNewPatients

    static constraints = {

        name(size 1..100)
        address(size 1..100)
        postcode(size 1..10)
        telephone(size 1..100)
        numberOfPatients(100)
        description(size 1..1000)
        openingTime()
        registeringNewPatients()

    }
}
