package exercises.ex_1

class Hospital {
    private var listPaciente: ArrayList<Paciente> = arrayListOf()


    fun addPaciente(paciente: Paciente) {
        listPaciente.add(paciente)

    }

    fun sexTotM(): Int {
        var c = 0
        for (p in listPaciente) {
            if (p.getSex()) {
                c++
            }
        }
        return c
    }

    fun getCantPerMun(mun: String): Int {
        var c = 0
        for (x in listPaciente) {
            if (mun == x.getMunicipio()) {
                c++
            }
        }
        return c
    }

    fun getEdadMedia(): Double {
        var a = 0.0
        for (x in listPaciente) {
            a += x.getEdad()
        }
        return a / listPaciente.size
    }

    fun ifExistPaciente(id: String): Boolean {
        for (x in listPaciente) {
            if (x.getId() == id) {
                return true
                break
            }
        }
        return false
    }

    fun sexToF(): Int {
        return listPaciente.size - sexTotM()
    }

    fun getPosPaciente(pos: Int): Paciente {
        return listPaciente.get(pos)
    }
}