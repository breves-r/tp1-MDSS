package com.infnet.tp1Rafa.service;

import com.infnet.tp1Rafa.model.Cliente;
import com.infnet.tp1Rafa.repository.ClienteRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> getAll() {
        return clienteRepository.findAll();
    }

    public Cliente getById(Long id) {
        checkClienteExists(id);
        return clienteRepository.findById(id).get();
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente update(Long id, Cliente cliente) {
        checkClienteExists(id);
        cliente.setId(id);
        return clienteRepository.save(cliente);
    }

    public void deleteById(Long id) {
        checkClienteExists(id);
        clienteRepository.deleteById(id);
    }

    public void checkClienteExists(Long id) {
        if (!clienteRepository.existsById(id)) throw new EntityNotFoundException("Cliente não encontrado");
    }
}
