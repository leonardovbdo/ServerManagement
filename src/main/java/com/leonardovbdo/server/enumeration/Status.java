package com.leonardovbdo.server.enumeration;

public enum Status {

    SERVER_UP("SERVER_UP"),
    SERVER_DOWN("SERVER_DOWN");

    private final String status;

    Status(String stauts) {
        this.status = stauts;
    }

    public String getStatus() {
        return status;
    }

}
