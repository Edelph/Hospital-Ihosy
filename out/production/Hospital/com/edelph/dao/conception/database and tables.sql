
DROP DATABASE IF EXISTS sanguin;
CREATE DATABASE IF NOT EXISTS sanguin;

    CREATE TABLE personne(
         code_personne INTEGER NOT NULL AUTO_INCREMENT ,
         nom VARCHAR (20),
         prenom VARCHAR (100),
         age INTEGER (2),
         sex CHAR(1) NOT NULL ,
         groupe_sanguin TINYINT(1) NOT NULL ,
         CONSTRAINT PRIMARY KEY (code_personne)
    );
    CREATE TABLE donneur(
        code_donneur INTEGER NOT NULL AUTO_INCREMENT,
        profession VARCHAR (50) DEFAULT NULL ,
        contact VARCHAR (10) DEFAULT NULL ,
        CIN VARCHAR (12) UNIQUE DEFAULT NULL ,
        lieu_naissance VARCHAR (30),
        date_naissance DATE ,
        adresse VARCHAR (20) DEFAULT 'Ihosy',
        PRIMARY KEY (code_donneur)
    );
    CREATE TABLE resultat_serologique(
         code_resultat_serologique INTEGER NOT NULL AUTO_INCREMENT ,
         syphilis TINYINT(1) DEFAULT 0,
         HIV TINYINT(1) DEFAULT 0,
         Hbs TINYINT(1) DEFAULT 0,
         HCV TINYINT(1) DEFAULT 0,
         PALU TINYINT(1) DEFAULT 0,
         CONSTRAINT PRIMARY KEY (code_resultat_serologique)
    );

    CREATE TABLE poche_sang(
        num_poche INTEGER NOT NULL AUTO_INCREMENT ,
        num_ordre INTEGER NOT NULL,
        statut_donneur TINYINT (1) DEFAULT 0,
        date_entree DATE DEFAULT CURRENT_TIMESTAMP ,
        TA_donneur VARCHAR (10),
        poid_donneur DECIMAL (3),
        date_sortie DATE DEFAULT NULL ,
        cause_sortie TINYINT(1),
        type_PSL TINYINT(1),
        category_poche TINYINT(1) DEFAULT 0,
        phenotypage VARCHAR (20),
        service TINYINT(1) DEFAULT NULL ,
        code_donneur INTEGER NOT NULL ,
        code_resultat_serologique INTEGER NOT NULL ,

        CONSTRAINT PRIMARY KEY (num_poche),
        CONSTRAINT fk_donneur FOREIGN KEY (code_donneur)
                                REFERENCES donneur(code_donneur),
        CONSTRAINT fk_serologique FOREIGN KEY (code_resultat_serologique)
                                REFERENCES resultat_serologique(code_resultat_serologique)
    );

    CREATE TABLE beneficiaire_poche_sang(
        code_beneficiaire INTEGER NOT NULL ,
        num_poche INTEGER NOT NULL ,
        CONSTRAINT fk_beneficiaire FOREIGN KEY (code_beneficiaire)
                                    REFERENCES personne(code_personne),
        CONSTRAINT fk_poche_sang FOREIGN KEY (num_poche)
                                    REFERENCES poche_sang(num_poche)
    );
