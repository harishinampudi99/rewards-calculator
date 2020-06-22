package com.rewards.service;

import java.util.List;

import com.rewards.dto.CustomerRewardsDTO;
import com.rewards.model.Rewards;

public interface RewardsService {

	void caluclateRewardPoints(List<Rewards> list);

	CustomerRewardsDTO getCustomerRewardPoints(String customerName);
}
