package org.example;

import org.apache.wicket.protocol.http.WebApplication;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see wicket.myproject.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    
    /**
     * Constructor
     */
	public WicketApplication()
	{
		mountPackage("/fff",HomePage.class);

	}

	@Override
	protected void init() {

	}

	/**
	 * @see wicket.Application#getHomePage()
	 */
	public Class getHomePage()
	{
		return HomePage.class;
	}

}
