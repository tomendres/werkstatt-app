package de.tom.endres.se.home.repository;

import de.tom.endres.se.home.domain.Waterworks;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Thomas Endres
 * @since 11.10.16
 * Copyright (c) 2016 mediosmanagement GmbH
 */
public interface WaterworksRepository extends MongoRepository<Waterworks, String> {
}
