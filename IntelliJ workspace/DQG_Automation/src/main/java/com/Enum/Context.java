package com.Enum;

public enum Context {
    DROPDOWNPRODUCT,
    SEARCHPRODUCT,
    LANG,
    COUNTRY;

    public String value;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
//    Context(String value){
//        this.value=value;
//    };
}
