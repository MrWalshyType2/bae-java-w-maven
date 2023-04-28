package com.qa.interfaces;

import java.time.ZonedDateTime;

public interface TimeLoggable extends Loggable {
    @Override
    default void log(String input) {
        System.out.println(ZonedDateTime.now() + ": " + input);
    }
}
