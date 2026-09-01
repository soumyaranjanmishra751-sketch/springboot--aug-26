package com.jt.demo;

import org.springframework.stereotype.Component;

/**
 * Engine
 */
@Component
public interface Engine {

    void startEngine();
    void stopEngine();
}