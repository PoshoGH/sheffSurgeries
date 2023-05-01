package com.jfield.model

class Schedule
{
    String SurgeryID
    String name

    String toString()
    {
        return name
    }
    
    static constraints = {}

    static hasMany = [appointments: Appointment]
}