package inheritance

import org.scalatest._

/**
  * Created by rmaloku on 23/01/2017.
  */
class HeroMeleeTest extends FlatSpec {

  "total damage " should " be equal to the damage of all items" in {
    val melee: HeroMelee = new HeroMelee(100, 12)
    melee.add(new ItemMelee(12, 20))
    melee.add(new ItemMelee(13, 20))
    assert(melee.totalItemDamage() == 25)
  }
}
