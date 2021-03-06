package de.tom.endres.se.home.service;

/**
 * @author Thomas Endres
 * @since 16.10.16
 * Copyright (c) 2016 mediosmanagement GmbH
 */
public interface GPIOService {

    void activateGardenLightningRelay();
    void deactivateGardenLightningRelay();
    void activateACTransformer();
    void deactivateACTransformer();
}
