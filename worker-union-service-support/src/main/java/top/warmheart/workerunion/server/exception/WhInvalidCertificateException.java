/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidCertificateException extends Exception {

	public WhInvalidCertificateException() {
		super();
	}

	public WhInvalidCertificateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidCertificateException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidCertificateException(String message) {
		super(message);
	}

	public WhInvalidCertificateException(Throwable cause) {
		super(cause);
	}


}
