package com.lopinivan.graphqlserver.service;

import com.lopinivan.graphqlserver.dao.ManicureClientRepository;
import com.lopinivan.graphqlserver.entity.ManicureClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ManicureClientServiceImpl implements ManicureClientService {

    private final ManicureClientRepository manicureClientRepository;

    @Autowired
    public ManicureClientServiceImpl(ManicureClientRepository manicureClientRepository) {
        this.manicureClientRepository = manicureClientRepository;
    }

    @Override
    public List<ManicureClient> getAllClients() {
        return manicureClientRepository.findAll();
    }

    @Override
    public ManicureClient getClientById(int id) {
        ManicureClient manicureClient = null;
        Optional<ManicureClient> optional = manicureClientRepository.findById(id);
        if(optional.isPresent()) {
            manicureClient = optional.get();
        }
        return manicureClient;
    }

    @Override
    public ManicureClient saveClient(ManicureClient manicureClient) {
        return manicureClientRepository.save(manicureClient);
    }

    @Override
    public void deleteClientById(int id) {
        manicureClientRepository.deleteById(id);
    }

    @Override
    public ManicureClient updateById(ManicureClient manicureClient) {
        return manicureClientRepository.save(manicureClient);
    }
}
