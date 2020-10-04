package controller;

import java.util.EventObject;

import model.DJ;
import model.Manager;
import model.PeopleBag;

public class DJDetailsEvent extends EventObject{
	private PeopleBag pBag;
	private Manager m;
	private DJ dj;
	public DJDetailsEvent(Object source, PeopleBag pBag, Manager m, DJ dj) {
		super(source);
		this.pBag = pBag;
		this.m = m;
		this.dj = dj;
	}
	
	public Manager getM(){
		return m;
	}
	public PeopleBag getPBag(){
		return pBag;
	}
	public DJ getDj(){
		return dj;
	}

}
