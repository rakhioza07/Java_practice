package com.corejava.enumtest;

public enum Status
{
	NEW(0), REJECTED(-1), ACCEPTED(1), COMPLETED(2);
	int value;
	Status(int value)
	{
		this.value=value;
	}
	
	@Override
	public String toString() {
				return ""+this.value;
		}
}
