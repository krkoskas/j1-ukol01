package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    zofka.penUp();


    zofka.turnLeft(180);
    zofka.move(150);
    zofka.turnRight(180);
    nakreslitPrasatko();

    /*zofka.turnRight(90);
    zofka.move(150);
    zofka.turnLeft(90);
    nakreslitOsmiuhelnik();
    zofka.move(150);
    nakreslitKruh();
    zofka.move(150);
    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnRight(90);
    nakreslitSlunicko();*/

    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(90);
    zofka.move(80);

    nakreslitDomecek();

    zofka.move(150);
    zofka.turnLeft(90);
    zofka.move(60);
    zofka.turnRight(90);

    nakreslitDomecky();

    zofka.turnLeft(90);
    zofka.move(60);
    zofka.turnLeft(90);
    zofka.move(150);
    zofka.turnLeft(180);

    nakreslitDomecek();

    zofka.move(250);
    zofka.turnLeft(90);
    zofka.move(150);
    zofka.turnRight(90);

    nakreslitSlunicko();

    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnLeft(90);

    nakresliZ();
    nakresliU();
    nakresliZ();
    nakresliK();
    nakresliA();
  }

  public void nakresliZ() {
    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnLeft(180);
    zofka.penDown();
    zofka.move(30);
    zofka.turnRight(130);
    zofka.move(50);
    zofka.turnLeft(130);
    zofka.move(30);
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.move(50);
    zofka.turnLeft(90);
  }

  public void nakresliU() {
    zofka.move(40);
    zofka.turnLeft(180);
    zofka.penDown();
    zofka.move(30);
    for (int i = 0; i < 4; i++) {
      zofka.turnLeft(45);
      zofka.move(10);
    }
    zofka.move(20);
    zofka.penUp();
    zofka.turnRight(90);
    zofka.move(20);
    zofka.turnRight(90);
    zofka.move(40);
    zofka.turnLeft(180);
  }

  public void nakresliK() {
    zofka.penDown();
    zofka.move(40);
    zofka.turnRight(180);
    zofka.move(20);
    zofka.turnLeft(45);
    zofka.move(30);
    zofka.turnRight(180);
    zofka.move(30);
    zofka.turnRight(90);
    zofka.move(30);
    zofka.turnRight(180);
    zofka.move(30);
    zofka.penUp();
    zofka.turnLeft(45);
    zofka.move(20);
    zofka.turnLeft(90);
    zofka.move(40);
    zofka.turnLeft(90);
  }

  public void nakresliA() {
    zofka.penDown();
    zofka.turnRight(30);
    zofka.move(40);
    zofka.turnRight(120);
    zofka.move(40);
    zofka.turnLeft(180);
    zofka.move(15);
    zofka.turnLeft(60);
    zofka.move(20);
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(15);
    zofka.turnLeft(90);
    zofka.move(40);
    zofka.turnLeft(90);
  }

  public void nakreslitDomecek() {
    zofka.penDown();
    for (int i = 0; i < 2; i++) {
      zofka.turnRight(90);
      zofka.move(60);
      zofka.turnRight(90);
      zofka.move(80);
    }
    for (int i = 0; i < 2; i++) {
      zofka.turnRight(45);
      zofka.move(42);
      zofka.turnRight(45);
    }
    zofka.turnLeft(180);
    zofka.penUp();
  }

  public void nakreslitDomecky() {
    for (int i=0; i<5; i++) {
      nakreslitDomecek();
      if (i<4) {
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(90);
      }
    }
  }

  public void nakreslitOsmiuhelnik() {
    zofka.penDown();
    for (int i = 0; i < 8; i++) {
      zofka.turnRight(45);
      zofka.move(60);
    }
    zofka.penUp();
  }

  public void nakreslitKruh() {
    zofka.penDown();
    for (int i=0; i < 18; i++) {
      zofka.turnRight(20);
      zofka.move(15);
    }
    zofka.penUp();
  }

  public void nakreslitSlunicko() {
    zofka.penDown();
    for (int i=0; i<12; i++) {
      for (int k=0; k<2; k++) {
        zofka.turnRight(15);
        zofka.move(10);
      }
      zofka.turnLeft(90);
      zofka.move(15);
      zofka.turnRight(180);
      zofka.move(15);
      zofka.turnLeft(90);
    }
    zofka.penUp();
  }

  public void nakreslitPrasatko() {
    zofka.penDown();
    zofka.turnLeft(90);
    nakreslitDomecek();
    zofka.penDown();
    zofka.turnRight(180);

    zofka.turnRight(90);
    zofka.move(60);
    zofka.turnLeft(45);
    for (int i = 0; i < 2; i++) {
      zofka.move(20);
      zofka.turnLeft(180);
      zofka.move(20);
      zofka.turnLeft(90);
    }

    zofka.turnRight(135);
    zofka.move(80);
    zofka.turnRight(135);
    zofka.move(20);
    zofka.turnLeft(180);
    zofka.move(20);
    zofka.turnRight(100);
    zofka.move(20);
    zofka.turnLeft(180);
    zofka.move(20);
    zofka.turnRight(35);
    zofka.penUp();
  }

}
