package com.jfield.model
import com.jfield.Appointment

class Doctor {
    static hasMany = [appointments: Appointment]

    String firstName
    String lastName
    String specialization

    static constraints = {
        firstName nullable: false
        lastName nullable: false
        specialization nullable: false, maxSize: 100
    }
}