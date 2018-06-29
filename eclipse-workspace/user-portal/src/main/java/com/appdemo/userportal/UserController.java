package com.appdemo.userportal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserController {
    @Autowired
    private UserService userService;
    
    @Autowired
    LoggerFactory lf;

    @PostMapping
    public User create(@RequestBody User user){
		Logger logger = lf.createLogger(LoggerType.CONSOLE);
		logger.error("adfasdfasf");
        return userService.create(user);
    }
    
    
    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") String id){
        return userService.findById(Integer.parseInt(id));
    }

    @GetMapping
    public List findAll(){
    	//System.out.println(">>>>>>>>>>>>>>>>>id"+userService.findByEmailAddress("asdf@asf.co").getId());
        return userService.findAll();
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") String id) {
        return userService.delete((Integer.parseInt(id)));
    }


    
}
