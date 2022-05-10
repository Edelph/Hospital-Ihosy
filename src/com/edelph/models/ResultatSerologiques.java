package com.edelph.models;

import java.util.HashMap;

public class ResultatSerologiques {
    public static final String[] listSerologiques = {"Syphilis", "HIV","Hbs","HCV","PALU"};
    private HashMap<String, Boolean> results = new HashMap<>();
    private int code;

    private void __setResults(){
        for(String serologique : listSerologiques){
            this.results.put(serologique, false );
        }
    }
    public ResultatSerologiques(){
        __setResults();
    }

    public int getCode() {
        return code;
    }

    public ResultatSerologiques setCode(int code) {
        this.code = code;
        return this;
    }

    public boolean getSyphilis() {
        return this.results.get("Syphilis");
    }

    public ResultatSerologiques setSyphilis(boolean syphilis) {
        this.setSerologique("Syphilis",syphilis);
        return this;
    }

    public boolean getHIV() {
        return this.results.get("HIV");
    }

    public ResultatSerologiques setHIV(boolean HIV) {
        this.setSerologique("HIV", HIV);
        return this;
    }

    public boolean getHbs() {
        return this.results.get("Hbs");
    }

    public ResultatSerologiques setHbs(boolean Hbs) {
        this.setSerologique("Hbs",Hbs);
        return this;
    }

    public boolean getHCV() {
        return this.results.get("HCV");
    }

    public ResultatSerologiques setHCV(boolean HCV) {
        this.setSerologique("HCV", HCV);
        return this;
    }

    public boolean getPalu() {
        return this.results.get("PALU");
    }

    public ResultatSerologiques setPalu(boolean PALU) {
        this.setSerologique("PALU",PALU);
        return this;
    }
    private void setSerologique(String key, Boolean value){
        this.results.remove(key);
        this.results.put(key,value);
    }
}
