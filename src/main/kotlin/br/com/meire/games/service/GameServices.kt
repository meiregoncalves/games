package br.com.meire.games.service

import br.com.meire.games.model.Game
import br.com.meire.games.repository.GameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

@Service
@Repository

class GameServices {

    @Autowired
    lateinit var gameRepository: GameRepository

    fun buscarTodos() : List<Game> {
        return gameRepository.findAll()
    }

    fun salvar(game: Game) {
        gameRepository.save(game)
    }

    fun buscarPor(nome : String) : List<Game> {
        return gameRepository.findByNomeIgnoreCaseContaining(nome)
    }

    fun apagar(id : String) {
        return gameRepository.deleteById(id)
    }
}
