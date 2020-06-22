package com.rewards.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rewards.dto.CustomerRewardsDTO;
import com.rewards.model.Rewards;
import com.rewards.service.RewardsService;

@RestController
public class RewardsCaluclator {
	@Autowired
	private RewardsService rewardsService;
	
	@GetMapping("/createDataSet")
	public void createDateSet() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		Rewards r1 = new Rewards();
		r1.setCustomerName("c1");
		r1.setPurchaseAmount(70);
		r1.setCreatedDate(sdf.parse("10/04/2020"));
		
		Rewards r2 = new Rewards();
		r2.setCustomerName("c1");
		r2.setPurchaseAmount(80);
		r2.setCreatedDate(sdf.parse("12/05/2020"));
		
		Rewards r3 = new Rewards();
		r3.setCustomerName("c1");
		r3.setPurchaseAmount(100);
		r3.setCreatedDate(sdf.parse("10/06/2020"));
		
		Rewards r4 = new Rewards();
		r4.setCustomerName("c1");
		r4.setPurchaseAmount(40);
		r4.setCreatedDate(sdf.parse("11/06/2020"));
		
		// 2nd Customer
		Rewards c1 = new Rewards();
		c1.setCustomerName("c2");
		c1.setPurchaseAmount(120);
		c1.setCreatedDate(sdf.parse("13/05/2020"));
		
		Rewards c2 = new Rewards();
		c2.setCustomerName("c2");
		c2.setPurchaseAmount(130);
		c2.setCreatedDate(sdf.parse("12/06/2020"));
		
		List<Rewards> list = new ArrayList<>();
		list.add(r1);
		list.add(r2);
		list.add(r3);
		list.add(r4);
		list.add(c1);
		list.add(c2);
		
		rewardsService.caluclateRewardPoints(list);
		
	}
	@GetMapping("/getCustomerRewardPoints")
	public CustomerRewardsDTO getCustomerRewardPoints(String customerName) throws ParseException{
		return rewardsService.getCustomerRewardPoints(customerName);
	}
}
