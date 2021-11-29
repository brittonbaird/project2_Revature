package com.revature.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Before;
import org.junit.Test;

import com.revature.travelapp.entity.Plan;

public class PlanTest {
	
	private Plan plan;
	
	@Before
	public void setUp() throws Exception{
		plan = new Plan();
		java.sql.Date date = java.sql.Date.valueOf( "2022-02-20" );
		plan.setUserId(1);
		plan.setPlaceId(1);
		plan.setCityName("testCity");
		plan.setCountryName("testCountry");
		plan.setNumPeople(1);
		plan.setTravelDate(date);
		plan.setTravelReturn(date);
	}
	

	@Test
	public void testGetUserId() {
		assertSame(1, plan.getUserId());
	}
	
	@Test
	public void testGetPlaceId() {
		assertSame(1, plan.getPlaceId());
	}
	
	@Test
	public void testGetCityName() {
		assertEquals("testCity", plan.getCityName());
	}
	
	@Test
	public void testGetCountryName() {
		assertEquals("testCountry", plan.getCountryName());
	}
	
	@Test
	public void testGetNumPeople() {
		assertSame(1, plan.getNumPeople());
	}
	
	@Test
	public void testGetTravelDate() {
		java.sql.Date date = java.sql.Date.valueOf( "2022-02-20" );
		assertEquals(date, plan.getTravelDate());
	}
	
	@Test
	public void testGetTravelReturn() {
		java.sql.Date date = java.sql.Date.valueOf( "2022-02-20" );
		assertEquals(date, plan.getTravelReturn());
	}
	
}
