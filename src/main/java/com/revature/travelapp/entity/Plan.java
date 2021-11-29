package com.revature.travelapp.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Entity
@Table(name = "myPlans")
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Plan {
	@Id
	@GeneratedValue
	@Column(name = "plan_id")
	private Integer placeId;
	@NotNull
	@Column(name = "country_name")
	private String countryName;
	@NotNull
	@Column(name = "city_name")
	private String cityName;
	@NotNull
	@Column(name = "travel_date")
	private Date travelDate;
	@NotNull
	@Column(name = "travel_return")
	private Date travelReturn;
	@NotNull
	@Column(name = "num_people")
	private Integer numPeople;
	@ManyToOne
	@JoinColumn(name = "userId", insertable = false, updatable = false)
	private User user;

	private Integer userId;

	@Transient
	private String emailId;

	@Transient
	private List<Integer> idList;

	public Plan() {
	}

	/**
	 * @return the placeId
	 */
	public Integer getPlaceId() {
		return placeId;
	}

	/**
	 * @param placeId the placeId to set
	 */
	public void setPlaceId(Integer placeId) {
		this.placeId = placeId;
	}

	/**
	 * @return the CountryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param CountryName the CountryName set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * @return the travelDate
	 */
	public Date getTravelDate() {
		return travelDate;
	}

	/**
	 * @param TravelDate the TravelDate to set
	 */
	public void setTravelDate(Date travelDate) {
		this.travelDate= travelDate;
	}

	/**
	 * @return the travelReturn
	 */
	public Date getTravelReturn() {
		return travelReturn;
	}

	/**
	 * @param travelReturn the travelReturn to set
	 */
	public void setTravelReturn(Date travelReturn) {
		this.travelReturn = travelReturn;
	}

	/**
	 * @return the NumPeople
	 */
	public Integer getNumPeople() {
		return numPeople;
	}

	/**
	 * @param NumPeople the NumPeople to set
	 */
	public void setNumPeople(Integer numPeople) {
		this.numPeople = numPeople;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**numPeople
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	
	/**
	 * @return the idList
	 */
	public List<Integer> getIdList() {
		return idList;
	}

	/**
	 * @param idList the idList to set
	 */
	public void setIdList(List<Integer> idList) {
		this.idList = idList;
	}

}
