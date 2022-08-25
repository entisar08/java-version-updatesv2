package com.cydeo;

public enum ProjectStatus {



        OPEN,CLOSED,PROGRESS("IN PROGRESS");//if you have one object with value while the rest are not you need to define no arg and with arg constructors

        String status;

        ProjectStatus(String status) {
            this.status = status;
        }

        ProjectStatus() {
        }
    }

