package de.sbn.fhem.alexa.controller;

import de.sbn.fhem.alexa.persistence.User;
import de.sbn.fhem.alexa.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Stefan on 09.02.2017.
 */
@RestController
public class UserRestService {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping({"/user"})
    public Map<String, String> user(Principal principal) {
        User user = userRepository.findByUsername(principal.getName());
        Map<String, String> map = new LinkedHashMap<>();
        if(user != null)
        {
            map.put("name", user.getUsername());
            map.put("host",user.getHost());
            map.put("port", user.getPort());
        }
        else
            map.put("name", principal.getName());
        return map;
    }
}
