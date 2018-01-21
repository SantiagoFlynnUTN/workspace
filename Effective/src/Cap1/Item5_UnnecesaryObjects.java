package Cap1;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/*
 *  Es mejor reutilizar una instancia que crear una con los mismos valores.
 *  	Lo hago creando el metodo como static.
 *  
 *  Also prefer primitives to boxed primitives, and watch out for unintentional autoboxing.
 *  	AutoBoxing: conversion automatica de primitivo a objeto.
 *  
 */

public class Item5_UnnecesaryObjects {

}


//NO HACER ESTO
class Person {
	//le asigno la hora actual para q no joda con el error.
	private final Date birthDate = Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTime();

	// Other fields, methods, and constructor omitte
	// DON'T DO THIS!
	public boolean isBabyBoomer() {
		// Unnecessary allocation of expensive object
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = gmtCal.getTime();
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}
}


//MEJOR HACER ESTO
class Person2 {
	private final Date birthDate = Calendar.getInstance(TimeZone.getTimeZone("GMT")).getTime();
	// Other fields, methods, and constructor omitted
	/**
	 * The starting and ending dates of the baby boom.
	 */
	private static final Date BOOM_START;
	private static final Date BOOM_END;

	static {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime();
	}

	public boolean isBabyBoomer() {
		return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
	}
}
