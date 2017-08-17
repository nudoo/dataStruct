package com.moea.linearList.strategy.impl;

import com.moea.linearList.strategy.Strategy;

public class DefaultStrategy implements Strategy {

	@Override
	public boolean equals(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		return obj1==obj2;
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		if(obj1.equals(obj2)){
			return 0;
		}		
		return obj1.toString().compareTo(obj2.toString());
		
	}

}
