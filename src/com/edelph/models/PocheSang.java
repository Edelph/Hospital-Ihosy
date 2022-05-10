package com.edelph.models;

import com.edelph.dao.models.causeSortieSang.CauseSortieSang;
import com.edelph.dao.models.poche.CategoryPoche;
import com.edelph.dao.models.services.Service;
import com.edelph.dao.models.statutDonneur.StatutDonneur;
import com.edelph.dao.models.typePSL.TypePSL;
import com.edelph.utils.Edate;


public class PocheSang {
    private Long numPoche;
    private Donneur donneur;
    private Beneficiaire beneficiaire;

    private int numOrdre;
    private Double poid;

    private String TA;
    private StatutDonneur statutDonneur;

    private Edate dateEntree;
    private Edate dateSortie;
    private CauseSortieSang causeSortieSang;

    private TypePSL typePSL;
    private CategoryPoche categoryPoche;
    private String phenotypage;
    private ResultatSerologiques resultatSerologiques;

    private Service service;


    public Long getNumPoche() {
        return numPoche;
    }

    public PocheSang setNumPoche(Long numPoche) {
        this.numPoche = numPoche;
        return this;
    }

    public Donneur getDonneur() {
        return donneur;
    }

    public PocheSang setDonneur(Donneur donneur) {
        this.donneur = donneur;
        return this;
    }

    public Beneficiaire getBeneficiaire() {
        return beneficiaire;
    }

    public PocheSang setBeneficiaire(Beneficiaire beneficiaire) {
        this.beneficiaire = beneficiaire;
        return this;
    }

    public int getNumOrdre() {
        return numOrdre;
    }

    public PocheSang setNumOrdre(int numOrdre) {
        this.numOrdre = numOrdre;
        return this;
    }

    public Double getPoid() {
        return poid;
    }

    public PocheSang setPoid(Double poid) {
        this.poid = poid;
        return this;
    }

    public String getTA() {
        return TA;
    }

    public PocheSang setTA(String TA) {
        this.TA = TA;
        return this;
    }

    public StatutDonneur getStatutDonneur() {
        return statutDonneur;
    }

    public PocheSang setStatutDonneur(StatutDonneur statutDonneur) {
        this.statutDonneur = statutDonneur;
        return this;
    }

    public Edate getDateEntree() {
        return dateEntree;
    }

    public PocheSang setDateEntree(Edate dateEntree) {
        this.dateEntree = dateEntree;
        return this;
    }

    public Edate getDateSortie() {
        return dateSortie;
    }

    public PocheSang setDateSortie(Edate dateSortie) {
        this.dateSortie = dateSortie;
        return this;
    }

    public CauseSortieSang getCauseSortieSang() {
        return causeSortieSang;
    }

    public PocheSang setCauseSortieSang(CauseSortieSang causeSortieSang) {
        this.causeSortieSang = causeSortieSang;
        return this;
    }

    public TypePSL getTypePSL() {
        return typePSL;
    }

    public PocheSang setTypePSL(TypePSL typePSL) {
        this.typePSL = typePSL;
        return this;
    }

    public CategoryPoche getCategoryPoche() {
        return categoryPoche;
    }

    public PocheSang setCategoryPoche(CategoryPoche categoryPoche) {
        this.categoryPoche = categoryPoche;
        return this;
    }

    public String getPhenotypage() {
        return phenotypage;
    }

    public PocheSang setPhenotypage(String phenotypage) {
        this.phenotypage = phenotypage;
        return this;
    }

    public ResultatSerologiques getResultatSerologiques() {
        return resultatSerologiques;
    }

    public PocheSang setResultatSerologiques(ResultatSerologiques resultatSerologiques) {
        this.resultatSerologiques = resultatSerologiques;
        return this;
    }

    public Service getService() {
        return service;
    }

    public PocheSang setService(Service service) {
        this.service = service;
        return this;
    }
}
