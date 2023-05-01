package com.jfield.model

class Patient {
    static hasMany = [appointments: Appointment]

    String firstName
    String lastName
    Integer age

    static constraints = {
        firstName nullable: false
        lastName nullable: false
        age min: 0
    }
}
