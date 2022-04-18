package com.tractive;

public class Mapping {

    public Mapping(String version, String edition) {
        this.version = version;
        this.edition = edition;
        this.quantity = 0;
    }

    private String version;

    private String edition;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    private Integer quantity;

    @Override
    public String toString() {
        return "{" + "version:'" + version + '\'' +
                ", edition:'" + edition + '\'' +
                ", quantity:'" + quantity + '\'' +
                "}";
    }
}
