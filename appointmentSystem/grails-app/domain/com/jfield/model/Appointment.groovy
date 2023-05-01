package com.jfield

class Appointment {
    static belongsTo = [doctor: Doctor, patient: Patient]

    Date appointmentDate
    String description

    static constraints = {
        appointmentDate nullable: false
        description nullable: false, maxSize: 255
    }
}