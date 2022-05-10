package com.edelph.dao.models.typePSL;

import java.util.Locale;

public class TypePSL {
    private int code = -1;
    public static final String[][] types = {
            {"ST", "Sans Total", "30"},
            {"CGR", "Culot Globulaire", "35"},
            {"PFC", "Plasma Frais Congélé", "365000"}
    };


    public TypePSL(){};
    public TypePSL(int codeTypePSL) throws Exception {
        this.setCode(codeTypePSL);
    }
    public TypePSL(String codeTypePSL) throws Exception {
        this.setCode(codeTypePSL);
    }

    public String getStringCode(){
        return types[this.code][0];
    }
    public int getCode(){
        return this.code;
    }

    public String getType(){
        return types[this.code][1];
    }

    public int getDuree(){
        return Integer.parseInt(types[this.code][2]);
    }

    public TypePSL setCode(int codeTypePSL) throws Exception {
        if(codeTypePSL>=types.length || codeTypePSL < 0) throw new Exception("invalid code Type StatusPSL");
        this.code = codeTypePSL;
        return this;
    }
    public TypePSL setCode(String codeTypePSL) throws  Exception{
        for (int i = 0; i < types.length; i++) {
            if(types[i][0].toLowerCase().equals(codeTypePSL.toLowerCase())){
                this.code = i;
                break;
            }
        }
        if (this.code == -1) throw new Exception("invalid code Type StatusPSL");
        return this;
    }

    @Override
    public String toString() {
        return this.getStringCode();
    }
}
