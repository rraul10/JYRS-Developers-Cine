package org.example.demo.usuarios.models

class Admin(
    id: String,
    nombre: String,
    apellidos: String,
    contraseña: String,
    email: String
) : Usuario(id, nombre, apellidos, email, contraseña)  {
}