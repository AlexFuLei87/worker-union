/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidCertificateAttachmentException extends Exception {

	public WhInvalidCertificateAttachmentException() {
		super();
	}

	public WhInvalidCertificateAttachmentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidCertificateAttachmentException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidCertificateAttachmentException(String message) {
		super(message);
	}

	public WhInvalidCertificateAttachmentException(Throwable cause) {
		super(cause);
	}


}
