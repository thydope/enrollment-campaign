package ua.thydope.finalproject.controller.listener;

import java.util.Optional;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class ContextListener implements ServletContextListener {
  private static final Logger LOGGER = LoggerFactory
      .getLogger("ua.thydope.finalproject.logging.file");

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    Set<String> activeAccounts = new ConcurrentSkipListSet<>();
    sce.getServletContext().setAttribute("activeAccounts", activeAccounts);
    LOGGER.debug(
        "Initialized servlets context at {} and created set of active users : {}",
        sce.getServletContext().getContextPath(), activeAccounts);
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    Optional.ofNullable(
        (Set<String>) sce.getServletContext().getAttribute("activeAccounts"))
        .ifPresent(Set::clear);
  }

}