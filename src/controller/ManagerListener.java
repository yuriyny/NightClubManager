package controller;

import java.util.EventListener;

import view.MyInfoManager;

public interface ManagerListener extends EventListener {
	public void click(MyInfoManagerEvent me);

}
