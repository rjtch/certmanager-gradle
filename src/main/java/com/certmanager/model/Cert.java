package com.certmanager.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "cert")
@Data
public class Cert implements Serializable {

    private static final long serialVersionUID = 1L;

    protected String _id;

    private String name;
    private LocalDate arrivedDate;
    private LocalDate modifyDate;
    private LocalDate lockeddate;
    private LocalDate unlockedDate;
    private boolean loked;
    private String encoded;
    private BigInteger serialNumber;


    public Cert() {
    }

    public Cert(String name, LocalDate arrivedDate, LocalDate modifyDate, LocalDate lockeddate,
                LocalDate unlockedDate, boolean loked, String contenttype) {
        super();
        this.name = name;
        this.arrivedDate = arrivedDate;
        this.modifyDate = modifyDate;
        this.lockeddate = lockeddate;
        this.unlockedDate = unlockedDate;
        this.loked = loked;
        this.encoded = contenttype;
    }

}
