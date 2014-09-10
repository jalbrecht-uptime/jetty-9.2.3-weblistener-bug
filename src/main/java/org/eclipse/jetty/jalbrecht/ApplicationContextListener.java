package org.eclipse.jetty.jalbrecht;

import org.eclipse.jetty.util.log.Log;
import org.eclipse.jetty.util.log.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ApplicationContextListener implements ServletContextListener {
	private static final Logger LOG = Log.getLogger(ApplicationContextListener.class);

	@Override public void contextInitialized(ServletContextEvent sce) {
		LOG.info("contextInitialized called");
	}

	@Override public void contextDestroyed(ServletContextEvent sce) {
		LOG.info("contextDestroyed called");
	}
}
