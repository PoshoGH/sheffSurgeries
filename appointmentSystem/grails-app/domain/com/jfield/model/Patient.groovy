package com.jfield.model

class Patient
{
    String PatientID
    String name
    

    String toString()
    {
        return name
    }

    static constraints =
    {
        PatientID unique: true, size: 5..10
        name size: 5..100
        course size: 5..100
    }


}
