package com.corejava.enumtest;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

public class HospitalTest {

	public static void main(String[] args) throws Exception {
		Hospital hospital=new Hospital();
		Hospital.Patient patient=hospital. new Patient(123);
		BPListener []listeners=new BPListener[3];
		listeners[0]=new Doctors();
		listeners[1]=new Nurse();
		listeners[2]=new PRTeam();
		for(BPListener bpl:listeners)
			hospital.addBPListener(bpl);
		while(true)
		{
			patient.setBloodPressure(new Random().nextInt(200));
			Thread.sleep(300);
		}
			}

}
