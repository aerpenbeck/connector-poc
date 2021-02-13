/*
 * Copyright (C) 2021 Arno Erpenbeck
 */
package com.example.connectorpoc.integration;

/**
 * Generic object transformer interface
 * @param <S> source type
 * @param <T> target type
 */
public interface OrderTransformer<S, T> {

    T transform(S source);

}
