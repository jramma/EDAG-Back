package com.joBarcelona.edag.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joBarcelona.edag.model.domain.Checkout;

public interface CheckoutRepo extends  MongoRepository<Checkout,String>{

}
