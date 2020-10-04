package model;

import java.io.Serializable;

public class Order implements Serializable{
	private static int idInt;
	private final String id;
	private String ename;
	private int numOfTickets;
	private double ticketPrice;
	private int numOfTables;
	private double tablePrice;
	private int numOfWine;
	private double winePrice;
	private int numOfCham;
	private double chamPrice;
	private int numOfVodka;
	private double vodkaPrice;
	private int numOfSoda;
	private double sodaPrice;
	
	private double totalPrice;
	
	private String date;
	private String time;

	public Order(String ename, int numOfTickets, double ticketPrice, int numOfTables, double tablePrice,
			double totalPrice, String date, String time,int numOfWine, double winePrice,int numOfCham, double chamPrice,
			int numOfVodka, double vodkaPrice,int numOfSoda, double sodaPrice) {
		super();
		this.ename = ename;
		this.numOfTickets = numOfTickets;
		this.ticketPrice = ticketPrice;
		this.numOfTables = numOfTables;
		this.tablePrice = tablePrice;
		this.numOfWine = numOfWine;
		this.winePrice = winePrice;
		this.numOfCham = numOfCham;
		this.chamPrice = chamPrice;
		this.numOfSoda = numOfSoda;
		this.sodaPrice = sodaPrice;
		this.numOfVodka = numOfVodka;
		this.vodkaPrice = vodkaPrice;
		this.totalPrice = totalPrice;
		this.id = String.valueOf(++idInt);
		this.date = date;
		this.time = time;
		
	}
	
	

	public String getDate() {
		return date;
	}
	



	public int getNumOfWine() {
		return numOfWine;
	}



	public void setNumOfWine(int numOfWine) {
		this.numOfWine = numOfWine;
	}



	public double getWinePrice() {
		return winePrice;
	}



	public void setWinePrice(double winePrice) {
		this.winePrice = winePrice;
	}



	public int getNumOfCham() {
		return numOfCham;
	}



	public void setNumOfCham(int numOfCham) {
		this.numOfCham = numOfCham;
	}



	public double getChamPrice() {
		return chamPrice;
	}



	public void setChamPrice(double chamPrice) {
		this.chamPrice = chamPrice;
	}



	public int getNumOfVodka() {
		return numOfVodka;
	}



	public void setNumOfVodka(int numOfVodka) {
		this.numOfVodka = numOfVodka;
	}



	public double getVodkaPrice() {
		return vodkaPrice;
	}



	public void setVodkaPrice(double vodkaPrice) {
		this.vodkaPrice = vodkaPrice;
	}



	public int getNumOfSoda() {
		return numOfSoda;
	}



	public void setNumOfSoda(int numOfSoda) {
		this.numOfSoda = numOfSoda;
	}



	public double getSodaPrice() {
		return sodaPrice;
	}



	public void setSodaPrice(double sodaPrice) {
		this.sodaPrice = sodaPrice;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getEname() {
		return ename;
	}

	public String getId() {
		return id;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getNumOfTickets() {
		return numOfTickets;
	}

	public void setNumOfTickets(int numOfTickets) {
		this.numOfTickets = numOfTickets;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getNumOfTables() {
		return numOfTables;
	}

	public void setNumOfTables(int numOfTables) {
		this.numOfTables = numOfTables;
	}

	public double getTablePrice() {
		return tablePrice;
	}

	public void setTablePrice(double tablePrice) {
		this.tablePrice = tablePrice;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public static void setIdInt(int id){
		idInt = id;
	}
	
	public static int getIdInt(){
		return idInt;
	}



	@Override
	public String toString() {
		return "Order [id=" + id + "]";
	}

	
	
	

}
