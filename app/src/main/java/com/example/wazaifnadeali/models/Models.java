package com.example.wazaifnadeali.models;

public class Models {
    String wazaifTitle, wazaifDetails, triqaAmal;

    public Models(String wazaifTitle, String wazaifDetails, String triqaAmal) {
        this.wazaifTitle = wazaifTitle;
        this.wazaifDetails = wazaifDetails;
        this.triqaAmal = triqaAmal;
    }

    public Models(String wazaifTitle) {
        this.wazaifTitle = wazaifTitle;
    }

    public Models() {

    }

    public String getWazaifTitle() {
        return wazaifTitle;
    }

    public void setWazaifTitle(String wazaifTitle) {
        this.wazaifTitle = wazaifTitle;
    }

    public String getWazaifDetails() {
        return wazaifDetails;
    }

    public void setWazaifDetails(String wazaifDetails) {
        this.wazaifDetails = wazaifDetails;
    }

    public String getTriqaAmal() {
        return triqaAmal;
    }

    public void setTriqaAmal(String triqaAmal) {
        this.triqaAmal = triqaAmal;
    }
}
