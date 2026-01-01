package com.xworkz.vastra.dao;

public enum DBConstant {
    URL("jdbc:mysql://localhost:3306/vastra_db"),
    USER("root"),
    PASSWORD("Sannidhi@123");
    private String value;
    DBConstant(String value){
        this.value=value;
    }
    public String getValue() {
        return value;
    }
}
