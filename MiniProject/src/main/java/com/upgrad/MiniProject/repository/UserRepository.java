package com.upgrad.MiniProject.repository;

import com.upgrad.MiniProject.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class UserRepository {

    //EntityManagerFactory
    @PersistenceUnit(unitName = "techblog")
    EntityManagerFactory entityManagerFactory;

    public void registerUser(User newUser){
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        try{
            transaction.begin();
            entityManager.persist(newUser);
            transaction.commit();

        }catch (Exception e){
            System.out.println(e.getMessage());
            transaction.rollback();
        }
    }


}

