package inheritance

/**
  * Created by rmaloku on 23/01/2017.
  */
class HeroMelee(hp: Int, override val attack: Int) extends Hero(hp, attack){
    private var items: List[ItemMelee] = _

  def add(itemMelee: ItemMelee): Unit = {
    if (items==null)
    {
      items = List(itemMelee)
    }
    else
      items = items.++(List(itemMelee))
  }


  def totalItemDamage(): Int = {
    // ToDo: Implement calculation with streams
    // items.stream().map((i: ItemMelee, _:Int) => i.damage).reduce(0, (a,b) => a+b);

    var total : Int = 0
    for (item: ItemMelee <- items)
    {
      total += item.damage
    }

    total
  }

  override def makeDamage(): Int = totalItemDamage() + attack
}
