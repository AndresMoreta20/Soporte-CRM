package com.racinesmoreta.soportecrm.run;

public enum RolEnum {
    ADMIN("Admin"),
    AGENT("Agent"),
    MANAGER("Manager"),
    ANALYST("Analyst"),
    SALES("Sales"),
    MARKETING("Marketing");

    private final String label;

    RolEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}