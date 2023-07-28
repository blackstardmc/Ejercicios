
import exercises.ex_1.Hospital
import exercises.ex_1.Paciente
import exercises.ex_2.Central

fun main(){
    val h=Hospital()
    h.addPaciente(Paciente("Julio","asd",23,2,23,"Santiago",false))
    h.addPaciente(Paciente("felipe","asd",23,2,23,"Santiago",false))
    h.addPaciente(Paciente("Antonio","asd",23,2,23,"Santiago",false))
    h.addPaciente(Paciente("Luis","asd",23,2,23,"Santiago",false))
    h.addPaciente(Paciente("Rafael","asd",23,2,23,"Santiago",false))
    h.addPaciente(Paciente("Julio","asd",23,2,23,"Santiago",false))


    println(h.getPosPaciente(4).name)
}