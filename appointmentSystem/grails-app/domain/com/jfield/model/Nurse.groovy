package com.jfield.model

class Nurse
{
    String NurseID
    String name
    

    String toString()
    {
        return name
    }

    static constraints =
    {
        NurseID unique: true, size: 5..10
        name size: 5..100
    }


}