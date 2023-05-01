package com.jfield.model

class Doctor
{
    String DoctorID
    String name
    

    String toString()
    {
        return name
    }

    static constraints =
    {
        DoctorID unique: true, size: 5..10
        name size: 5..100
    }


}