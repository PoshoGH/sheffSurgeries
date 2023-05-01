package com.jfield.model


class Doctor {
    

    String firstName
    String lastName
    String specialization

    static constraints = {
        firstName nullable: false
        lastName nullable: false
        specialization nullable: false, maxSize: 100
    }
}