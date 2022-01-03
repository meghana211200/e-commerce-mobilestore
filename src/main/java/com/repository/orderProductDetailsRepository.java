package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.orderProductDetails;

@Repository
public interface orderProductDetailsRepository  extends JpaRepository<orderProductDetails, Integer> {

}
