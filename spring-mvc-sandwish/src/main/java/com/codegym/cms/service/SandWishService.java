package com.codegym.cms.service;

import com.codegym.cms.dto.Sandwich;
import com.codegym.cms.repository.SandWishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class SandWishService {

    @Autowired
    private SandWishRepository sandWishRepository;

    public SandWishService(SandWishRepository sandWishRepository){
        this.sandWishRepository = sandWishRepository;
    }

    public void save(Sandwich sandwich){
        sandWishRepository.save(sandwich);
    }

    public List<Sandwich> findAll(){
        return sandWishRepository.findAll();
    }


}
