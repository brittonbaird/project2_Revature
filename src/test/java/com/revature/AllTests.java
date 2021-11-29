package com.revature;

import org.junit.runners.Suite;

import com.revature.entity.PlanTest;
import com.revature.entity.UserTest;

import com.revature.service.PlanServiceTest;

import com.revature.service.UserServiceTest;

import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({PlanServiceTest.class,  
					 UserServiceTest.class,
					 PlanTest.class,
					 UserTest.class})
public class AllTests {

}
