package com.rewards.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rewards.model.Rewards;

@Repository
public interface RewardsRepository extends CrudRepository<Rewards, Long>{

	List<Rewards> findByCustomerName(String customerName);
}
