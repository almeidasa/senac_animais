/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivo;

import animais.CachorroBean;
import com.google.gson.Gson;

/**
 *
 * @author Alexandre Almeida
 */
public class Json {

    public static void createJSON() {
        CachorroBean cachorro = new CachorroBean();
        cachorro.setIdade(1);
        cachorro.setNome("Xanin");
        cachorro.setRaca("Persa");

        Gson gson = new Gson();
        String json = gson.toJson(cachorro);

        System.out.println(json);
    }

}
