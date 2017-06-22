package view;

import java.util.Observer;
import java.awt.event.KeyListener;

/**
 * 
 * @author dimitri,anthony,alexis,florian
 *
 */
public abstract class EventPerformer extends UpdateSprite implements KeyListener, Observer{
	/**
	 * @see KeyListener
	 * Public attribute
	 */
	public boolean KeyPressed ;

}
