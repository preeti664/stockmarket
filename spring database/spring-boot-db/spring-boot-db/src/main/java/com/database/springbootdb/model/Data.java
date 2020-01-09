package com.database.springbootdb.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.*;

@Entity
public class Data {
		
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 
	 
	public Date date = new Date();
	
	 public  double High;
	
	 public double Low;
	
	 public double Close;
	
	 public double Shared_Traded;
	
	 public double Turnover;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getHigh() {
		return High;
	}

	public void setHigh(double high) {
		High = high;
	}

	public double getLow() {
		return Low;
	}

	public void setLow(double low) {
		Low = low;
	}

	public double getClose() {
		return Close;
	}

	public void setClose(double close) {
		Close = close;
	}

	public double getShared_Traded() {
		return Shared_Traded;
	}

	public void setShared_Traded(double shared_Traded) {
		Shared_Traded = shared_Traded;
	}

	public double getTurnover() {
		return Turnover;
	}

	public void setTurnover(double turnover) {
		Turnover = turnover;
	}
	
	
	
	

	
	
}
