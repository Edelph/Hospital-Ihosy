package com.edelph.dao.models.statutDonneur;

import java.util.HashMap;

public class StatutDonneur {
    private int code = -1 ;
    private String stringCode;
    protected String statut;

    public static final String[][] statuts = {
            {
                "NDB",
                "Nouveaux Donneur Bénevole"
            },
            {
                "DBR",
                "Donneur Benevol Regulière"
            },
            {
                "DF",
                "Donneur Familiale"
            }

    };

    public StatutDonneur(){}
    public StatutDonneur(int codeStatutDonneur) throws Exception {
        this.setCode(codeStatutDonneur);
    }
    public StatutDonneur(String codeStatutDonneur) throws Exception {
        this.setCode(codeStatutDonneur);
    }

    public int getCode() {
        return code;
    }
    public StatutDonneur setCode(int codeStatusDonneur) throws Exception {
        if(codeStatusDonneur>= statuts.length || codeStatusDonneur < 0) throw new Exception("invalid code Statut Donneur");
        this.code = codeStatusDonneur;
        return this;
    }

    public String getStatut() {
        return statuts[this.code][1];
    }

    public String getStringCode(){
        return statuts[this.code][0];
    }

    public StatutDonneur setCode(String stringCode) throws Exception{
        for (int i = 0; i < statuts.length; i++) {
            if(stringCode.toString().equals(statuts[i][0].toLowerCase())){
                this.code = i;
                break;
            }
        }
        if(this.code == -1) throw new Exception("invalid string code donneur");
        return this;
    }

    @Override
    public String toString() {
        return this.getStringCode();
    }

}
