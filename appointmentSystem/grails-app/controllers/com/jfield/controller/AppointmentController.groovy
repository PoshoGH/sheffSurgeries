package com.jfield.controller

import grails.gorm.transactions.Transactional
import com.jfield.model.Appointment

@Transactional
class AppointmentController {

    static scaffold = Appointment

    // Controller actions and methods

}
