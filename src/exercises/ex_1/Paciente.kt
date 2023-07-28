package exercises.ex_1

class Paciente(
    private var name: String,
    private var id: String,
    private var sala: Int,
    private var cama: Int,
    private var edad: Int,
    private var municipio: String,
    private var sexo: Boolean
){
    fun getName(): String {
        return name
    }
    fun getSex():Boolean{
        return sexo
    }
    fun getEdad():Int{
        return edad
    }

    fun getId():String{
        return id
    }

    fun getMunicipio():String{
        return municipio
    }
}