package de.tom.endres.se.home.service;

/**
 * @author Thomas Endres
 * @since 16.10.16
 * Copyright (c) 2016 mediosmanagement GmbH
 */
public interface SMSGateway {
    /**
     * Send a sms via the gateway.
     * @param phoneNumber recipient phone number
     * @param text text message
     */
    void sendSMSMessage(String phoneNumber, String text);
}
