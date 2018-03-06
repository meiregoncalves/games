package br.com.meire.games.repository

import br.com.meire.games.model.Game
import org.springframework.data.mongodb.repository.MongoRepository

interface GameRepository : MongoRepository<Game, String> {
    fun findByNomeIgnoreCaseContaining(nome: String) : List<Game>
}

