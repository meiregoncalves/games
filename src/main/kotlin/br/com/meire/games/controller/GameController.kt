package br.com.meire.games.controller

import br.com.meire.games.model.Game
import br.com.meire.games.service.GameServices
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
@CrossOrigin
@RequestMapping(value = "/game")

class GameController {

    @Autowired
    lateinit var gameService: GameServices

    @GetMapping
    fun BuscarTodos() : List<Game> {
        return gameService.buscarTodos()
    }

    @PostMapping
    fun salvar(@RequestBody game: Game) {
        gameService.salvar(game)
    }

    @GetMapping(value = "/titulo/{titulo}")
    fun buscarPor(@PathVariable (value = "titulo") titulo : String ) : List<Game> {
        return gameService.buscarPor(nome = titulo)
    }

    @DeleteMapping("{id}")
    fun apagar(@PathVariable(value = "id") id : String) {
        gameService.apagar(id)
    }
}