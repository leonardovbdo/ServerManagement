package com.leonardovbdo.server.repositories;

import com.leonardovbdo.server.models.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
