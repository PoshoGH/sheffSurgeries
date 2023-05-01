package com.jfield.model

class Receptionist {
    String firstName
    String lastName
    String email
    String phoneNumber

    static constraints = {
        firstName nullable: false
        lastName nullable: false
        email nullable: false, email: true
        phoneNumber nullable: false, matches: /^[0-9]{10}$/
    }
}