package com.xworkz.railway.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="railway_station")

public class RailwayDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="STATIONN_ID")
	private int stationId;
	
	@Column(name="STATIONNAME")
	private String stationName;
	
	@Column(name="TICKETISSUECOUNTER")
	private int ticketIssueCounter;
	
	@Column(name="NOOFPLATFORMS")
	private int noOfPlatforms;
	
	@Column(name="NOOFWORKERS")
	private int noOfWorkers;
	
	public RailwayDTO(){
		System.out.println(this.getClass().getSimpleName() + "object created");
		
	}
	

	public RailwayDTO( String stationName,int ticketIssueCounter,int noOfPlatforms, int noOfWorkers) {
		super();
		this.stationName = stationName;
		this.ticketIssueCounter = ticketIssueCounter;
		this.noOfPlatforms = noOfPlatforms;
		this.noOfWorkers = noOfWorkers;
	}


	@Override
	public String toString() {
		return "RailwayDTO [stationId=" + stationId + ", stationName=" + stationName + ", ticketIssueCounter="
				+ ticketIssueCounter + ", noOfPlatforms=" + noOfPlatforms + ", noOfWorkers=" + noOfWorkers + "]";
	}
	
	
	

}
