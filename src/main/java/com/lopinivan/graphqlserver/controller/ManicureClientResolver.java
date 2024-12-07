package com.lopinivan.graphqlserver.controller;

import com.lopinivan.graphqlserver.entity.ManicureClient;
import com.lopinivan.graphqlserver.service.ManicureClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ManicureClientResolver {

    private final ManicureClientService manicureClientService;

    @Autowired
    public ManicureClientResolver(ManicureClientService manicureClientService) {
        this.manicureClientService = manicureClientService;
    }

    @QueryMapping
    public List<ManicureClient> getAllClients() {
        return manicureClientService.getAllClients();
    }

    @QueryMapping
    public ManicureClient getClientById(@Argument int id) {
        return manicureClientService.getClientById(id);
    }

    @MutationMapping
    public ManicureClient saveClient(
            @Argument String name,
            @Argument String surname,
            @Argument String email,
            @Argument String phoneNumber,
            @Argument String customerReview,
            @Argument int amountSpent,
            @Argument int discount) {
        ManicureClient manicureClient = new ManicureClient(
                0,
                name,
                surname,
                email,
                phoneNumber,
                customerReview,
                amountSpent,
                discount);
        return manicureClientService.saveClient(manicureClient);
    }

    @MutationMapping
    public ManicureClient updateClient(
            @Argument int id,
            @Argument String name,
            @Argument String surname,
            @Argument String email,
            @Argument String phoneNumber,
            @Argument String customerReview,
            @Argument int amountSpent,
            @Argument int discount) {
        ManicureClient manicureClient = new ManicureClient(
                id,
                name,
                surname,
                email,
                phoneNumber,
                customerReview,
                amountSpent,
                discount);
        return manicureClientService.updateById(manicureClient);
    }

    @MutationMapping
    public boolean deleteClientById(@Argument int id) {
        manicureClientService.deleteClientById(id);
        return true;
    }
}
