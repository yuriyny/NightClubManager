package model;

import java.io.Serializable;

public class ClubEvent implements Serializable {
	private String name;
	private Manager manager;
	private PeopleBag employees;
	private String date;
	private String time;
	private String ticketPrice;
	private Owner owner;
	private PeopleBag custumers;
	private Bartender bartender;
	private DJ dj;
	private Waiter waiter;
	private Cook cook;
	private Cashier cashier;
	private TableBag tb;
	private WineBag wb;
	private ChampagneBag cb;
	private VodkaBag vb;
	private SodaBag sb;
	private TicketBag ticketb;

	public ClubEvent(String name, Manager manager, PeopleBag employees, String date, String time, String ticketPrice,
			Owner owner, PeopleBag custumers, Bartender bartender, DJ dj, TableBag tb, WineBag wb, ChampagneBag cb,
			VodkaBag vb, SodaBag sb, TicketBag ticketb, Waiter waiter, Cook cook, Cashier cashier) {
		super();
		this.name = name;
		this.manager = manager;
		this.employees = employees;
		this.date = date;
		this.time = time;
		this.ticketPrice = ticketPrice;
		this.owner = owner;
		this.bartender = bartender;
		this.dj = dj;
		this.custumers = custumers;
		this.tb = tb;
		this.wb = wb;
		this.cb = cb;
		this.vb = vb;
		this.sb = sb;
		this.ticketb = ticketb;
		this.waiter = waiter;
		this.cook = cook;
		this.cashier = cashier;

	}

	public Waiter getWaiter() {
		return waiter;
	}

	public void setWaiter(Waiter waiter) {
		this.waiter = waiter;
	}

	public Cook getCook() {
		return cook;
	}

	public void setCook(Cook cook) {
		this.cook = cook;
	}

	public Cashier getCashier() {
		return cashier;
	}

	public void setCashier(Cashier cashier) {
		this.cashier = cashier;
	}

	public WineBag getWb() {
		return wb;
	}

	public TicketBag getTicketb() {
		return ticketb;
	}

	public void setTicketb(TicketBag ticketb) {
		this.ticketb = ticketb;
	}

	public void setWb(WineBag wb) {
		this.wb = wb;
	}

	public ChampagneBag getCb() {
		return cb;
	}

	public void setCb(ChampagneBag cb) {
		this.cb = cb;
	}

	public VodkaBag getVb() {
		return vb;
	}

	public void setVb(VodkaBag vb) {
		this.vb = vb;
	}

	public SodaBag getSb() {
		return sb;
	}

	public void setSb(SodaBag sb) {
		this.sb = sb;
	}

	public TableBag getTb() {
		return tb;
	}

	public void setTb(TableBag tb) {
		this.tb = tb;
	}

	public DJ getDj() {
		return dj;
	}

	public void setDj(DJ dj) {
		this.dj = dj;
	}

	public String getName() {
		return name;
	}

	public Bartender getBartender() {
		return bartender;
	}

	public void setBartender(Bartender bartender) {
		this.bartender = bartender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public PeopleBag getEmployees() {
		return employees;
	}

	public void setEmployees(PeopleBag employees) {
		this.employees = employees;
	}

	public String getDate() {
		return date;
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

	public String getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(String ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public PeopleBag getCustumers() {
		return custumers;
	}

	public void setCustumers(PeopleBag custumers) {
		this.custumers = custumers;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public Owner getOwner() {
		return owner;
	}

	@Override
	public String toString() {
		return "Event [name=" + name + ", manager=" + manager + ", employees=" + employees + ", date=" + date
				+ ", time=" + time + ", ticketPrice=" + ticketPrice + "]";
	}

}
