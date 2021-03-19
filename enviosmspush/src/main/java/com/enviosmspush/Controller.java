package com.enviosmspush;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {


    @RequestMapping(value = "/envio", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public String getEnvioSmsPush(@RequestBody Comunication comunication) {
        System.out.println(comunication.toString());

        if(comunication.getIdCliente() == null || comunication.getMensagem() == null || comunication.getSenha() == null) {
            return "Mensagem não pode ser enviada";
        }

        if(comunication != null) {
            return "Mensagem recebida para envio";
        }

        return "";
    }

}
