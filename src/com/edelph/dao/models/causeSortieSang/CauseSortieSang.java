package com.edelph.dao.models.causeSortieSang;

public class CauseSortieSang {
    private int code = -1;
    public static String[] causes = {
            "Transfusée",
            "Retournée",
            "Jetée",
            "Perimée",
            "Quantitée Insufissant"
    };

    public CauseSortieSang(){}
    public CauseSortieSang(int codeCauseSortieSang) throws Exception {
        this.setcause(codeCauseSortieSang);
    }
    public  CauseSortieSang(String cause) throws Exception {
        this.setCause(cause);
    }

    public int getCode() {
        return code;
    }

    public CauseSortieSang setCode(int code) {
        this.code = code;
        return this;
    }

    public String getCause(){
        return causes[this.code];
    }

    public CauseSortieSang setcause(int codeCauseSortieSang) throws Exception {
        if(codeCauseSortieSang >= causes.length || codeCauseSortieSang < 0)throw new Exception("invalid cause sortie sanguin ");
        this.code = codeCauseSortieSang;
        return this;
    }

    public CauseSortieSang setCause(String cause) throws Exception {
        for (int i = 0; i < causes.length; i++) {
            if (causes[i].toLowerCase().equals(cause.toLowerCase())){
                this.code = i;
                return this;
            }
        }
        if(this.code == -1) throw new Exception("invalid cause sortie sanguin ");
        return this;
    }

    @Override
    public String toString() {
        return this.getCause();
    }
}
