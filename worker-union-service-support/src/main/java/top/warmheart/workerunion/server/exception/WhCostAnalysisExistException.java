/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhCostAnalysisExistException extends Exception {

	public WhCostAnalysisExistException() {
		super();
	}

	public WhCostAnalysisExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhCostAnalysisExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhCostAnalysisExistException(String message) {
		super(message);
	}

	public WhCostAnalysisExistException(Throwable cause) {
		super(cause);
	}


}
