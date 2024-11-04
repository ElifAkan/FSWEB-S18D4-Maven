package com.workintech.s18d1.dao;


import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Repository
public class BurgerDaoImpl implements BurgerDao{

  private final EntityManager entityManager;

  public BurgerDaoImpl(EntityManager entityManager){
      this.entityManager=entityManager;
  }

    @Transactional
    @Override
    public Burger save(Burger burger){
      log.info("save started");

      log.info("save ended");

      return null;
    }

    @Override
    public List<Burger> findAll(){
      TypedQuery<Burger> foundAll =entityManager.createQuery("SELECT b from Burger b", Burger.class);
        return foundAll.getResultList();
    }

    @Override
    public Burger findById(long id){
        return null;
    }

    @Override
    public Burger update(Burger burger){
        return null;
    }

    @Override
    public Burger remove(long id){
        return null;
    }

    @Override
    public List<Burger>findByPrice(Integer price){
        return null;
    }

    @Override
    public List<Burger> findByBreadType(BreadType breadType) {
        return List.of();
    }

    @Override
    public List<Burger> findByContent(String content) {
        return List.of();
    }

}
