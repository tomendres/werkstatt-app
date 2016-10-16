package de.tom.endres.se.home.domain;

import org.springframework.data.annotation.Id;

/**
 * @author Thomas Endres
 * @since 11.10.16
 * Copyright (c) 2016 mediosmanagement GmbH
 */
public class GardenIrrigation {

    @Id
    String id;

    String description;

    @Override
    public String toString() {
        return String.format(
                "GardenIrrigation[id=%s, description='%s']",
                id, description);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
