package com.flpoliveira.inventory.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accessory implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String ticket;
	private String site;
	private Integer quantity;
	private Date lastUpdated;
	private String lastUpdatedBy;
	private Integer totalReleased;
	

	public Accessory() {

	}

	

	public Accessory(Integer id, String name, String ticket, String site, Integer quantity, Date lastUpdated, String lastUpdatedBy,
			Integer totalReleased) {
		
		this.id = id;
		this.name = name;
		this.ticket = ticket;
		this.site = site;
		this.quantity = quantity;
		this.lastUpdated = lastUpdated;
		this.lastUpdatedBy = lastUpdatedBy;
		this.totalReleased = totalReleased;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Integer getTotalReleased() {
		return totalReleased;
	}

	public void setTotalReleased(Integer totalReleased) {
		this.totalReleased = totalReleased;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accessory other = (Accessory) obj;
		return Objects.equals(id, other.id);
	}



	@Override
	public String toString() {
		return "Accessory [id=" + id + ", name=" + name + ", ticket=" + ticket + ", site=" + site + ", quantity="
				+ quantity + ", lastUpdated=" + lastUpdated + ", lastUpdatedBy=" + lastUpdatedBy + ", totalReleased="
				+ totalReleased + "]";
	}

	
	

}
