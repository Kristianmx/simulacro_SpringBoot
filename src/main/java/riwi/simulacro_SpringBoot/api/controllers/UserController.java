package riwi.simulacro_SpringBoot.api.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import riwi.simulacro_SpringBoot.api.dto.responses.UserResponse;
import riwi.simulacro_SpringBoot.infrastructure.abstrac_services.IUserService;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    @Autowired
    private final IUserService userService;

    @Operation(summary = "Mostrar todos los usuarios", description = "Trae todos los usuarios registrados.")
    @GetMapping
    public ResponseEntity<Page<UserResponse>> getAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(defaultValue = "5") int size
    ){
        return  ResponseEntity.ok(this.userService.getAll(page -1, size));
    }

    @Operation(summary = "Buscar usuario por su ID",description = "Trae al usuario que coincida con la id. \n\nParametro: \n- id: id del usuario ")
    @GetMapping(path = "/{id}")
    public  ResponseEntity<UserResponse> getById(
            @PathVariable Long id
    ){
        return  ResponseEntity.ok(this.userService.get(id));
    }




}
