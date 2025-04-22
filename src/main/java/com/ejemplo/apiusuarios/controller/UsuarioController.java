package com.ejemplo.apiusuarios.controller;

import com.ejemplo.apiusuarios.model.Usuario;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public List<Usuario> obtenerUsuarios() {
        return Arrays.asList(
                new Usuario(1L, "César Quintero", "cesar.quintero@example.com", "987654321", "Lima"),
                new Usuario(2L, "Laura Rodríguez", "laura.rodriguez@example.com", "912345678", "Arequipa"),
                new Usuario(3L, "María López", "maria.lopez@example.com", "956789012", "Cusco"),
                new Usuario(4L, "Javier Morales", "javier.morales@example.com", "998877665", "Trujillo"),
                new Usuario(5L, "Ana Torres", "ana.torres@example.com", "987112233", "Piura"),
                new Usuario(6L, "Luis Fernández", "luis.fernandez@example.com", "934567891", "Lima"),
                new Usuario(7L, "Daniela Méndez", "daniela.mendez@example.com", "945612378", "Iquitos"),
                new Usuario(8L, "Carlos Romero", "carlos.romero@example.com", "923456789", "Tacna"),
                new Usuario(9L, "Valeria Soto", "valeria.soto@example.com", "910203040", "Chiclayo"),
                new Usuario(10L, "Gabriel Núñez", "gabriel.nunez@example.com", "999888777", "Huancayo"),
                new Usuario(11L, "Lucía Herrera", "lucia.herrera@example.com", "978654321", "Lima"),
                new Usuario(12L, "Ricardo Díaz", "ricardo.diaz@example.com", "987112244", "Puno"),
                new Usuario(13L, "Andrea Vargas", "andrea.vargas@example.com", "935687421", "Ica"),
                new Usuario(14L, "Fernando Ruiz", "fernando.ruiz@example.com", "921234567", "Tumbes"),
                new Usuario(15L, "Paula Jiménez", "paula.jimenez@example.com", "956123789", "Lambayeque")


                );
    }
}
