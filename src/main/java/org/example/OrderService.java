package org.example;

import java.util.Set;

public interface OrderService {

    void create();

    Set<String> read();

    void update();

    void delete();

    void deleteAll();
}
