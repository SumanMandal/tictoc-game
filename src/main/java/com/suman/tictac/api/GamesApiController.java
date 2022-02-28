package com.suman.tictac.api;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.suman.tictac.model.GameDetails;
import com.suman.tictac.model.GameMove;
import com.suman.tictac.model.GameResponse;
import com.suman.tictac.model.MoveResponse;
import com.suman.tictac.model.UserDetails;
import com.suman.tictac.service.GameServiceImpl;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-01-28T13:27:51.824432900+05:30[Asia/Calcutta]")
@RestController
public class GamesApiController implements GamesApi {

    private static final Logger log = LoggerFactory.getLogger(GamesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    
    @Autowired
    GameServiceImpl gameService ;

    @org.springframework.beans.factory.annotation.Autowired
    public GamesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<GameResponse> createGame(@Parameter(in = ParameterIn.DEFAULT, description = "Pet object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody UserDetails body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return new ResponseEntity<GameResponse>(this.gameService.createGame(body.getPlayerX(), body.getPlayerO()),HttpStatus.OK);
        }

        return new ResponseEntity<GameResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<MoveResponse> gamesGameIdMovesPost(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("game-id") String gameId,@Parameter(in = ParameterIn.DEFAULT, description = "order placed for purchasing the pet", required=true, schema=@Schema()) @Valid @RequestBody GameMove body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
        	return new ResponseEntity<MoveResponse>(this.gameService.updateMove(gameId, body.getRow(),body.getColumn() ),HttpStatus.OK);
        }

        return new ResponseEntity<MoveResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<GameDetails>> getGames() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {

            return new ResponseEntity<List<GameDetails>>(this.gameService.getAllGame(),HttpStatus.OK);
//            try {
//                return new ResponseEntity<GameDetails>(objectMapper.readValue("{\r\n  \"player_o\" : \"player_o\",\r\n  \"player_x\" : \"player_x\",\r\n  \"id\" : 0,\r\n  \"replay\" : [ {\r\n    \"column\" : 1,\r\n    \"row\" : 6,\r\n    \"timestamp\" : \"timestamp\"\r\n  }, {\r\n    \"column\" : 1,\r\n    \"row\" : 6,\r\n    \"timestamp\" : \"timestamp\"\r\n  } ]\r\n}", GameDetails.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<GameDetails>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        }

        return new ResponseEntity<List<GameDetails>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
