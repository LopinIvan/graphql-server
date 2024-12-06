package com.lopinivan.graphqlserver.service;

import com.lopinivan.graphqlserver.entity.ManicureClient;

import java.util.List;

public interface ManicureClientService {

    public List<ManicureClient> getAllClients();

    public ManicureClient getClientById(int id);

    public ManicureClient saveClient(ManicureClient manicureClient);

    public void deleteClientById(int id);

    public ManicureClient updateById(ManicureClient manicureClient);
}
