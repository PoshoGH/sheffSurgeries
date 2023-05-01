package com.jfield.model


class Nurse {
   

    String firstName
    String lastName
    String department

    static constraints = {
        firstName nullable: false
        lastName nullable: false
        department nullable: false, maxSize: 100
    }
}