package com.kharysh.ostap;

public class Main {

    public static void main(String[] args) {
	/*Dollar10Disp d10 = new Dollar10Disp();
        Dollar20DIsp d20 = new Dollar20DIsp();
        Dollar50DIsp d50 = new Dollar50DIsp();
        d50.setNext(d20);
        d20.setNext(d10);
        d50.getAmout(new Currency(130));*/

	Bankomat s = new Bankomat();
        s.withdrawMonet(600);
    }
}
