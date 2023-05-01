package com.jfield.model

class Receptionist
{
    String ReceptionistID
    String name
    

    String toString()
    {
        return name
    }

    static constraints =
    {
        ReceptionistID unique: true, size: 5..10
        name size: 5..100
    }


}