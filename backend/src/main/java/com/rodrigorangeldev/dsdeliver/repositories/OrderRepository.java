package com.rodrigorangeldev.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rodrigorangeldev.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
