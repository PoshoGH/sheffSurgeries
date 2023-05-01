package com.jfield.model

class Appointment
{
    String AppointmentID
    Date dateTime

    String toString()
    {
        return dateTime
    }
    
        static constraints =
    {
        AppointmentID unique: true, size: 5..10
    }

   
}