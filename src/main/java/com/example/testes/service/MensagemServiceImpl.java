package com.example.testes.service;

import com.example.testes.service.MensagemService;
import org.springframework.stereotype.Service;

@Service
public class MensagemServiceImpl implements MensagemService {

    @Override
    public String getMessage() {
        return "Olá do MensagemService!";
    }
}
