package com.certmanager;

import com.certmanager.model.Cert;
import org.springframework.data.mongodb.core.mapping.event.AbstractMongoEventListener;
import org.springframework.data.mongodb.core.mapping.event.BeforeSaveEvent;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Objects;

@Component
public class CallBackListener extends AbstractMongoEventListener<Cert> {

    @Override
    public void onBeforeSave(BeforeSaveEvent<Cert> event) {
        event.getSource().setArrivedDate(LocalDate.now());
        if(Objects.nonNull(event.getSource().get_id())) {
            event.getSource().setArrivedDate(LocalDate.now());
        }else {
            event.getSource().setModifyDate(LocalDate.now());
        }
        super.onBeforeSave(event);
    }
}
