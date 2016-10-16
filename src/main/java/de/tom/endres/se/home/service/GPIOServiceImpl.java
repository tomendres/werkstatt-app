package de.tom.endres.se.home.service;

import com.pi4j.io.gpio.*;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Thomas Endres
 * @since 16.10.16
 * Copyright (c) 2016 mediosmanagement GmbH
 */
@Service
public class GPIOServiceImpl implements GPIOService {

    private GpioController gpioController;

    private GpioPinDigitalOutput gardenLightPin;
    private GpioPinDigitalOutput acTransformatorPin;



    public GPIOServiceImpl() {
    }

    @PostConstruct
    void initialize() {
        gpioController = GpioFactory.getInstance();
        gardenLightPin = gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_13, "GardenLight", PinState.HIGH);
        acTransformatorPin = gpioController.provisionDigitalOutputPin(RaspiPin.GPIO_12, "ACTransformator", PinState.HIGH);

        gardenLightPin.setShutdownOptions(true, PinState.HIGH);
        acTransformatorPin.setShutdownOptions(true, PinState.HIGH);
    }

    @PreDestroy
    void destroy() {
        this.gpioController.shutdown();
    }


    @Override
    public void activateGardenLightningRelay() {
        gardenLightPin.low();
    }

    @Override
    public void deactivateGardenLightningRelay() {
        gardenLightPin.high();
    }

    @Override
    public void activateACTransformer() {
        acTransformatorPin.low();
    }

    @Override
    public void deactivateACTransformer() {
        acTransformatorPin.high();
    }
}
