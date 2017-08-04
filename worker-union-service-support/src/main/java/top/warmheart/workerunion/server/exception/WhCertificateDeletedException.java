/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhCertificateDeletedException extends Exception {

	public WhCertificateDeletedException() {
		super();
	}

	public WhCertificateDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhCertificateDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhCertificateDeletedException(String message) {
		super(message);
	}

	public WhCertificateDeletedException(Throwable cause) {
		super(cause);
	}


}
