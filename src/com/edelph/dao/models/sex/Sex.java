package com.edelph.dao.models.sex;

public  class Sex  {
    protected String code;
    protected String sex;


    public static Sex getInstance(String codeSex) throws Exception {
        if("m".equals(codeSex.toLowerCase())) return new Male();
        if ("f".equals(codeSex.toLowerCase())) return new Female();
        throw new  Exception("invalide code of sex ( 'm' for male and 'f' for female");
    }

    public String getCode() {
        return code;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return code;
    }
}
