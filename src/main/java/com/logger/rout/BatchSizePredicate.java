package com.logger.rout;

import java.util.ArrayList;

import org.apache.camel.Exchange;
import org.apache.camel.Predicate;
import org.apache.commons.collections.CollectionUtils;

public class BatchSizePredicate implements Predicate {

	public int size;

	public BatchSizePredicate(int size) {
		this.size = size;
	}

	@Override
	public boolean matches(Exchange exchange) {
		if (exchange != null) {
			ArrayList<?> list = exchange.getIn().getBody(ArrayList.class);
			if (CollectionUtils.isNotEmpty(list) && list.size() == size) {
				return true;
			}
		}
		return false;
	}

}
