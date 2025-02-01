package com.domain.java_backend_template.users.controller;
import com.domain.java_backend_template.users.controller.dto.UserDTO;
import com.domain.java_backend_template.users.domain.UsersService;
import com.domain.java_backend_template.users.domain.domainObjects.User;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersService usersService;
    private final ModelMapper modelMapper;
    
    @Autowired
    public UsersController(UsersService usersService, ModelMapper modelMapper) {
        this.usersService = usersService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("/")
    public UserDTO create(@RequestBody UserDTO user) {
        return modelMapper.map(usersService.create(modelMapper.map(user, User.class)), 
        UserDTO.class);
    }

    @GetMapping("/{id}")
    public UserDTO get(@PathVariable String id) {
        return modelMapper.map(usersService.get(id), UserDTO.class);    
    }
 
    @PutMapping("/{id}")
    public UserDTO update(@PathVariable String id, @RequestBody UserDTO user) {
        return modelMapper.map(usersService.update(id, modelMapper.map(user, User.class)), 
        UserDTO.class);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        usersService.delete(id);
    }
}
