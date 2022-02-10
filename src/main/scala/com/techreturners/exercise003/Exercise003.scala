package com.techreturners.exercise003

class Exercise003 {

  val myIceCreams: List[IceCream] = List(IceCream("Pistachio", 0),
                                        IceCream("Raspberry Ripple", 1),
                                        IceCream("Vanilla", 2),
                                        IceCream("Mint Chocolate Chip", 3),
                                        IceCream("Chocolate", 4),
                                        IceCream("Mango Sorbet", 5))

  def getIceCreamCode(iceCreamFlavour: String): Int = {
    var code = -1
    for(iceCream <- myIceCreams)
        if (iceCream.flavour == iceCreamFlavour) code = iceCream.code
    code
  }

  def iceCreamFlavours: Array[String] = {
    var flavours = Array[String]()
    for(iceCream <- myIceCreams)
      flavours :+= iceCream.flavour
    flavours
  }

}
