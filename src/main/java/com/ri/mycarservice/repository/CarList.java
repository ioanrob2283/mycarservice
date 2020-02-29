package com.ri.mycarservice.repository;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/* Projection interface */
@JsonPropertyOrder({"id", "name"})
public interface CarList {

    Long getId();

    String getName();
}
