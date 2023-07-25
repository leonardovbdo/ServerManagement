package com.leonardovbdo.server.services;

import com.leonardovbdo.server.models.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {

    Server create(Server server);

    Server ping(String ipAddress) throws IOException;

    //Limite que servidores que serão listados
    Collection<Server> list(int limit);

    Server get(Long id);

    Server update(Server server);

    Boolean delete(Long id);
}
