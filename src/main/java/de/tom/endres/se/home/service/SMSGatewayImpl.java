package de.tom.endres.se.home.service;

import de.tom.endres.se.home.domain.Outbox;
import de.tom.endres.se.home.repository.OutboxRepository;
import org.springframework.stereotype.Service;

/**
 * @author Thomas Endres
 * @since 16.10.16
 * Copyright (c) 2016 mediosmanagement GmbH
 */
@Service
public class SMSGatewayImpl implements SMSGateway {

    private OutboxRepository outboxRepository;

    public SMSGatewayImpl(OutboxRepository outboxRepository) {
        this.outboxRepository = outboxRepository;
    }

    @Override
    public void sendSMSMessage(String phoneNumber, String text) {
        Outbox outbox = new Outbox();
        outbox.setDestinationNumber(phoneNumber);
        outbox.setText(text);
    }
}
