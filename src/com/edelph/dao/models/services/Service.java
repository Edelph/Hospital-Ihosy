package com.edelph.dao.models.services;


public class Service {
    private int code = -1;

    public static final String[] services = {
        "Pediatrie",
        "Medecine",
        "Maternite",
        "ATU",
        "Chirurgie"
    };

    public Service(){}
    public Service(int codeService) throws Exception {
       this.setCode(codeService);
    }
    public Service(String service) throws Exception{
        this.setService(service);
    }

    public int getCode() {
        return code;
    }

    public Service setCode(int codeService) throws Exception {
        if(codeService>services.length || codeService < 0) throw new Exception("invalid codeServices");
        else this.code = codeService;
        return this;
    }

    public String getService() {
        return services[this.code];
    }

    public Service setService(String service) throws Exception {
        for (int i= 0; i<services.length; i++){
            if(services[i].toLowerCase().equals(service.toLowerCase())) {
                this.code = i;
                break;
            }
        }
        if(this.code == -1) throw new Exception("services invalid");
        return this;
    }

    @Override
    public String toString() {
        return this.getService();
    }
}
