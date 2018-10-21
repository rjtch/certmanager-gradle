package com.certmanager.service;

import com.certmanager.model.Cert;

import java.util.List;

public interface CertManagerservice {

    void undoBockedCert(String _id);

    boolean checkIfBlocked(Cert crt);

    List<Cert> findAllBlockedCerts();

    Cert uploadNewCert(Cert cert);

    Cert blockCert(String id);

    String getCertInString(String _id);

    List<Cert> findAllcerts();

}
