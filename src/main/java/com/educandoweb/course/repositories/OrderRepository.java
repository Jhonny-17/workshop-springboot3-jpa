package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.etities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
