package de.tom.endres.se.home.repository;

import de.tom.endres.se.home.domain.Outbox;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Thomas Endres
 * @since 16.10.16
 * Copyright (c) 2016 mediosmanagement GmbH
 */
public interface OutboxRepository extends JpaRepository<Outbox, Integer> {
}
