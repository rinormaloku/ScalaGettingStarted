package inheritance

/**
  * Created by rmaloku on 23/01/2017.
  */
abstract class Hero(var hp: Int, val attack: Int) {
  def takeDamage(dmg : Int): Unit = {
    hp -= dmg
  }

  def makeDamage(): Int
}

object HeroCompanion {
  def defaultHero() : Hero = {
    new Hero(100,16){
      override def makeDamage(): Int = attack
    }
  }
}
/*
  Scala:
    class Hero(val hp: Int, val attack: Int)

  Java:
    public class inheritance.Hero {
      public int hp();
      public int attack();
      public inheritance.Hero(int, int);
    }
* */

/*
  Scala:
    class Hero(val hp: Int, var attack: Int)

  Java:
    public class inheritance.Hero {
      public int hp();
      public void hp_$eq(int);             <-- Setter for HP as now it is "VAR"
      public int attack();
      public inheritance.Hero(int, int);
    }
* */


