package com.bestbuy.demo.exceptions;

import org.apache.log4j.Logger;

/**
 *
 */
public class HtmlElementsException extends RuntimeException {
   
	private static final long serialVersionUID = 1L;

	private static Logger log = Logger.getLogger(HtmlElementsException.class);
	public HtmlElementsException() {
        super();
    }

    public HtmlElementsException(String message) {
        super(message);
        log.fatal(message);
    }

    public HtmlElementsException(String message, Throwable cause) {
        super(message, cause);
        log.fatal(message, cause);
    }

    public HtmlElementsException(Throwable cause) {
        super(cause);
        log.fatal(cause);
    }
}
