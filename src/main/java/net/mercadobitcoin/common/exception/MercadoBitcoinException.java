/**
 * under the MIT License (MIT)
 * Copyright (c) 2015 Mercado Bitcoin Servicos Digitais Ltda.
 * @see more details in /LICENSE.txt
 */

package net.mercadobitcoin.common.exception;

/**
 * Mercado Bitocin generic exception type used in internal errors.
 */
public class MercadoBitcoinException extends Exception {

	private static final long serialVersionUID = 2121820371459560136L;

	public MercadoBitcoinException(String message) {
		super(message);
	}

}
