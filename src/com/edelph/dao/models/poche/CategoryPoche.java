package com.edelph.dao.models.poche;

public class CategoryPoche {
    protected int code;

    public static final String[][] categories = {
            {"D", "Double"},
            {"S", "Simple"}
    };

    public CategoryPoche(){}
    public CategoryPoche(int codeCategorie) throws Exception {
        this.setCode(codeCategorie);
    }
    public CategoryPoche(String codeCategorie) throws Exception{
        this.setCode(codeCategorie);
    }

    public int getCode() {
        return code;
    }

    public String getCategorie() {
        return categories[this.code][1];
    }
    public String getStringCode(){
        return categories[this.code][0];
    }

    public CategoryPoche setCode(int codeCategorie) throws Exception {
        if(codeCategorie>=categories.length || codeCategorie < 0) throw new Exception("invalid code Categorie");
        this.code = codeCategorie;
        return this;
    }

    public CategoryPoche setCode(String codeCategorie) throws Exception{
        for (int i = 0; i < categories.length; i++) {
            if(categories[i][0].toLowerCase().equals(codeCategorie.toLowerCase())){
                this.code = i;
                return this;
            }
        }
        if (this.code == -1) {
            for (int i = 0; i < categories.length; i++) {
                if(categories[i][1].toLowerCase().equals(codeCategorie.toLowerCase())){
                    this.code = i;
                    return this;
                }
            }
            throw new Exception("invalid code Categorie");
        }
        return this;
    }

    @Override
    public String toString() {
        return this.getStringCode();
    }
}
