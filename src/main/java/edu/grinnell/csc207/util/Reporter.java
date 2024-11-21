package edu.grinnell.csc207.util;

/**
 * A simple mechanism to allow programs to report steps in different ways.
 */
public interface Reporter {
  /**
   * Report.
   *
   * @param str
   *   The string to report/print.
   */
  public void report(String str);
} // Reporter
