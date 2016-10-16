package de.tom.endres.se.home.repository;

import de.tom.endres.se.home.domain.GardenIrrigation;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Thomas Endres
 * @since 11.10.16
 * Copyright (c) 2016 mediosmanagement GmbH
 */
public interface GardenIrrigationRepository extends MongoRepository<GardenIrrigation, String> {
}
