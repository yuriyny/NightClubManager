package view;

import java.util.EventListener;

import controller.MyInfoManagerEvent;

public interface ManagerListener extends EventListener {
	public void click(MyInfoManagerEvent me);

}
