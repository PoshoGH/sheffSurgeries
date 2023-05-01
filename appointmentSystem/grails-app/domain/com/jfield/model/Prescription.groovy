package com.jfield.model

class Prescription {
    static belongsTo = [patient: Patient, doctor: Doctor]

    String medication
    String instructions

    static constraints = {
        medication nullable: false, maxSize: 100
        instructions nullable: false, maxSize: 255
    }
}