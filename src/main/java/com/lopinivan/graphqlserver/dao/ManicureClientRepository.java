package com.lopinivan.graphqlserver.dao;

import com.lopinivan.graphqlserver.entity.ManicureClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManicureClientRepository extends JpaRepository<ManicureClient, Integer> {
}
