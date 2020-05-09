package klient.spring.klient.service;

import klient.spring.klient.model.Klient;
import klient.spring.klient.repository.KlientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KlientService {
    @Autowired
    private KlientRepository klientRepository;

    public void add(Klient klient){
        klientRepository.save(klient);
    }
    public List<Klient> getBazaDanych(){
        return klientRepository.findAll();
    }
}
