package com.edelph.dao.models.sang;

public class GroupeSanguin {
    private int code = -1;

    public static final String[] groups = {
            "A+","A-",     "B+","B-",     "O+","O-",    "AB+","AB-",
    };

    public GroupeSanguin(){}
    public GroupeSanguin(int codeSang) throws Exception {
        this.setCode(codeSang);
    }
    public GroupeSanguin(String Groupe) throws Exception {
        this.setGroupe(Groupe);
    }

    public int getCode() {
        return code;
    }

    public GroupeSanguin setCode(int codeSang) throws Exception {
        if(codeSang>= groups.length || codeSang < 0) throw new Exception("invalid code sang");
        this.code = codeSang;
        return this;
    }

    public String getGroupe() {
        return groups[this.code];
    }

    public GroupeSanguin setGroupe(String groupe) throws Exception {
        for (int i = 0; i<groups.length ; i++) {
            if(groups[i].toLowerCase().equals(groupe.toLowerCase())){
                this.code = i;
                return this;
            }
        }
        if (this.code == -1) throw new Exception("invalid Group sang");
        return this;
    }

    @Override
    public String toString() {
        return this.getGroupe();
    }
}
