package com.questdome.gwt.presenter.client;

import com.google.gwt.user.client.ui.IsWidget;


/**
 * A simple and straightforward implementation of {@link Presenter}.
 * 
 * @author alex dobjanschi
 * @since gwt-presenter 0.1
 *
 * @param <Display> display type. It must be a subclass of {@link IsWidget}.
 */
public abstract class BasePresenter<Display extends IsWidget> 
	implements Presenter<Display> {
	
	// Display bound
	protected Display display;

	public BasePresenter(Display display) {
		this.display = display;
	}
	
	/**
	 * This constructor is specially meant for dependency injection.
	 * First you create the view, then instantiate presenter/presenters
	 * for it, following by setting the {@link #display} member of each
	 * presenter to that view.
	 */
	public BasePresenter () {
		this (null);
	}

	@Override
	public Display getDisplay() {
		return this.display;
	}

	@Override
	public void setDisplay(Display display) {
		this.display = display;
	}
}
