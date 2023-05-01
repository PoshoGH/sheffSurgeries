package com.jfield
import com.jfield.Doctor
import com.jfield.Patient

class Appointment {
    static belongsTo = [doctor: Doctor, patient: Patient]

    Date appointmentDate
    String description

    static constraints = {
        appointmentDate nullable: false
        description nullable: false, maxSize: 255
    }
}