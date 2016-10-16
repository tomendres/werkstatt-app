package de.tom.endres.se.home.service;

import net.aksingh.owmjapis.CurrentWeather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author Thomas Endres
 * @since 12.10.16
 * Copyright (c) 2016 mediosmanagement GmbH
 */
@Service
public class WeatherServiceImpl implements WeatherService {

    @Value("${weather.apikey}")
    String apikey;

    @Override
    public CurrentWeather getCurrentWeather() {
        return null;
    }
}
