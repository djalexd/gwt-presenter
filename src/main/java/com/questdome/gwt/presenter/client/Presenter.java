package com.questdome.gwt.presenter.client;

import com.google.gwt.user.client.ui.IsWidget;


/**
 * <p>A lightweight presenter, one of the key components of 
 * <a href="http://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93presenter">MVP</a>
 * architecture. Unlike other MVP solutions, this presenter only commits to
 * having a <i>generic display</i> - its only restriction being a subclass
 * of {@link IsWidget}.</p>
 * 
 * <p>Although there aren't any specific rules or best practices, usually
 * a presenter is strictly related to a view component. That means it's not
 * unusual to define a presenter like this:
 * 
 * <pre>
 *  interface Login extends IsWidget {
 *  
 *    interface LoginPresenter extends Presenter<Login> {
 *      // login specific logic operations
 *    }
 *    
 *    // login specific Ui operations
 *  }
 * </pre>
 * However, that doesn't mean any number of presenters can work
 * together to serve a view.</p>
 * 
 * <p>The only logical limitation to this extremely easy framework is
 * the fact that a presenter doesn't have <strong>true polymorphic</strong>
 * views. Simply put, a <strong>specific</strong> presenter implementation
 * only knows how to deal with a specific (even interface) view. But, as
 * one would look down from theory to practice, he could not help notice
 * that, while this appears as a limitation, it actually enforces encapsulation
 * and working with interfaces (defs).</p>
 *  
 * @author alex dobjanschi
 * @since gwt-presenter 0.1
 */
public interface Presenter<Display extends IsWidget> {
	/**
	 * Returns the display previously bound to this presenter.
	 * @return The display bound to this presenter.
	 */
	Display getDisplay ();
	
	/**
	 * Bind the display to presenter.
	 * @param display The display required to bind.
	 */
	void setDisplay (Display display);
}
