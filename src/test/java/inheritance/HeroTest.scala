package inheritance

import org.scalatest._

/**
  * Created by rmaloku on 23/01/2017.
  */
class HeroTest extends FlatSpec {

  "A default hero " should "start with 100 HP" in {
    val hero = HeroCompanion.defaultHero()
    assert(hero.hp == 100)
  }

  "Damage intake " should "should reduce hp" in {
    val hero = HeroCompanion.defaultHero()
    hero.takeDamage(20)
    assert(hero.hp == 80)
  }

}
