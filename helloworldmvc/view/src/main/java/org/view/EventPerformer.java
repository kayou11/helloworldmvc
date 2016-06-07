package org.view;

import org.contract.IOrderPerformed;
import org.gameframe.IEventPerformed;

public abstract class EventPerformer implements IEventPerformed{
	private IOrderPerformed orderPerformed; 
}
