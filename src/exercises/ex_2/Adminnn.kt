package exercises.ex_2

class Adminnn {
    var listCentral= ArrayList<Central>()

    fun add(c:Central){
        listCentral.add(c)
    }

    fun totalProducida():Int{
        var sum=0;
        for (x in listCentral){
            sum+=x.azucarProducida
        }
        return sum
    }


    fun promedioCanha():Double{
        var sum=0.0;
        for (x in listCentral){
            sum+=x.cantMolida
        }
        return sum/listCentral.size
    }

    fun centralMayor():Central{
        var mayor=listCentral.get(0).cantMolida
        var central:Central=listCentral.get(0)
        for (x in listCentral){
            if(x.cantMolida>mayor){
                mayor=x.cantMolida
                central=x;
            }
        }
        return central
    }
}