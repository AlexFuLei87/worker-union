/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhCertificateAttachmentDeletedException extends Exception {

	public WhCertificateAttachmentDeletedException() {
		super();
	}

	public WhCertificateAttachmentDeletedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhCertificateAttachmentDeletedException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhCertificateAttachmentDeletedException(String message) {
		super(message);
	}

	public WhCertificateAttachmentDeletedException(Throwable cause) {
		super(cause);
	}


}
