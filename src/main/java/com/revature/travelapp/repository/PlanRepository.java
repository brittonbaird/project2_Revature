package com.revature.travelapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.travelapp.entity.Plan;

public interface PlanRepository extends JpaRepository<Plan, Integer> {

	public List<Plan> findPlansByUserId(Integer userId);

	public Plan findPlansByPlaceId(Integer id);
}
