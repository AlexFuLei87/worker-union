/**
 * Copyright © WarmHeart Intelligence Science&Technology(NanJing) Company, Limited.
 * All Rights Reserved
 */
package top.warmheart.workerunion.server.exception;

@SuppressWarnings("serial")
public class WhInvalidMaterialTransferApplicationException extends Exception {

	public WhInvalidMaterialTransferApplicationException() {
		super();
	}

	public WhInvalidMaterialTransferApplicationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public WhInvalidMaterialTransferApplicationException(String message, Throwable cause) {
		super(message, cause);
	}

	public WhInvalidMaterialTransferApplicationException(String message) {
		super(message);
	}

	public WhInvalidMaterialTransferApplicationException(Throwable cause) {
		super(cause);
	}


}
