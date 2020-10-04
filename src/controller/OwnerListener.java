package controller;

import java.util.EventListener;

public interface OwnerListener extends EventListener {
	public void click(OwnerInfoEvent oe);
}
