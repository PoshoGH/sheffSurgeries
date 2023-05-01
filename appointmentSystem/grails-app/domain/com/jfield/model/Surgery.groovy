package com.jfield.model

class Surgery {
    String name
    String location
    String surgeon

    static constraints = {
        name nullable: false
        location nullable: false
        surgeon nullable: false
    }
}