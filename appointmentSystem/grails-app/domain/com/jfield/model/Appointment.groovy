package com.jfield.model

import grails.gorm.annotation.Entity

@Entity
class Appointment {
    Date appointmentDate
    String description

    static constraints = {
        appointmentDate nullable: false
        description nullable: false, maxSize: 255
    }
}
