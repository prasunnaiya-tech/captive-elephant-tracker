package org.wild.animal.captive.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ElephantDetails {
	
	@Id
	@GeneratedValue
	private long elephantId;
	private String elephantName;
	private String path;
	private Timestamp date;
	private String createdBy;
	private String lastUpdatedBy;
	private Timestamp lastUpdatedDate;
	private int areaRange;
	private String currentGPSLocation;
	private String registeredGPSLocation;
	
	public ElephantDetails() {
		super();
	}
	
	public ElephantDetails(long elephantId, String elephantName, String path, Timestamp date, String createdBy,
			String lastUpdatedBy, Timestamp lastUpdatedDate, int areaRange, String currentGPSLocation,
			String registeredGPSLocation) {
		super();
		this.elephantId = elephantId;
		this.elephantName = elephantName;
		this.path = path;
		this.date = date;
		this.createdBy = createdBy;
		this.lastUpdatedBy = lastUpdatedBy;
		this.lastUpdatedDate = lastUpdatedDate;
		this.areaRange = areaRange;
		this.currentGPSLocation = currentGPSLocation;
		this.registeredGPSLocation = registeredGPSLocation;
	}
	/**
	 * @return the elephantId
	 */
	public long getElephantId() {
		return elephantId;
	}
	/**
	 * @param elephantId the elephantId to set
	 */
	public void setElephantId(long elephantId) {
		this.elephantId = elephantId;
	}
	/**
	 * @return the elephantName
	 */
	public String getElephantName() {
		return elephantName;
	}
	/**
	 * @param elephantName the elephantName to set
	 */
	public void setElephantName(String elephantName) {
		this.elephantName = elephantName;
	}
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * @return the date
	 */
	public Timestamp getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Timestamp date) {
		this.date = date;
	}
	/**
	 * @return the createdBy
	 */
	public String getCreatedBy() {
		return createdBy;
	}
	/**
	 * @param createdBy the createdBy to set
	 */
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	/**
	 * @return the lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	/**
	 * @return the lastUpdatedDate
	 */
	public Timestamp getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	/**
	 * @param lastUpdatedDate the lastUpdatedDate to set
	 */
	public void setLastUpdatedDate(Timestamp lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	/**
	 * @return the areaRange
	 */
	public int getAreaRange() {
		return areaRange;
	}
	/**
	 * @param areaRange the areaRange to set
	 */
	public void setAreaRange(int areaRange) {
		this.areaRange = areaRange;
	}
	/**
	 * @return the currentGPSLocation
	 */
	public String getCurrentGPSLocation() {
		return currentGPSLocation;
	}
	/**
	 * @param currentGPSLocation the currentGPSLocation to set
	 */
	public void setCurrentGPSLocation(String currentGPSLocation) {
		this.currentGPSLocation = currentGPSLocation;
	}
	/**
	 * @return the registeredGPSLocation
	 */
	public String getRegisteredGPSLocation() {
		return registeredGPSLocation;
	}
	/**
	 * @param registeredGPSLocation the registeredGPSLocation to set
	 */
	public void setRegisteredGPSLocation(String registeredGPSLocation) {
		this.registeredGPSLocation = registeredGPSLocation;
	}
	}
