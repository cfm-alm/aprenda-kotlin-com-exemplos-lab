enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        val nome = usuario.nome
        println("Usuario $nome matriculado")
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    val user1 = Usuario("user1")
    val user2 = Usuario("user2")
    
    val lista_conteudo = listOf(ConteudoEducacional("math"), ConteudoEducacional("SCIENCE"))
    
    val form = Formacao("f1", lista_conteudo)
    form.matricular(user1)
    form.matricular(user2)
}