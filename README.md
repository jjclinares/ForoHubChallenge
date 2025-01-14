# Foro Hub Challenge Back End

## ✨ Descripción
Foro Hub Challenge es una aplicación web para la gestión de foros educativos, donde los usuarios pueden crear, listar, actualizar y eliminar tópicos relacionados con diversos cursos y temáticas. Este proyecto no solo representa una solución técnica, sino también un paso significativo en mi crecimiento como desarrollador, al integrar diversas tecnologías y aplicar mejores prácticas en desarrollo backend abordando nuevos desafíos como la implementación de autenticación y control de acceso basado en tokens JWT.

---

## ✨ Funcionalidades

### Mínimas
- **CRUD de Tópicos**: Crear, listar, actualizar y eliminar tópicos.
- **Validaciones**: Validar datos en el registro y actualización.
- **Autenticación con Spring Security**: Gestión de inicio de sesión mediante credenciales seguras.
- **Tokens JWT**: Generación y validación de tokens para autenticar solicitudes.
- **Control de acceso**: Protección de rutas para usuarios autenticados.


### Opcionales
- **Paginación**: Implementación de paginación en las respuestas de los endpoints.
- **Búsqueda por filtros**: Filtrar tópicos por curso o fecha.
- **Ordenamiento por fecha de creación**: Ordenar los resultados en función de la fecha en que fueron creados.

---
## 🌱 Aprendizajes y Reflexiones

Trabajar en este proyecto ha sido una experiencia enriquecedora en mi desarrollo como desarrollador backend. Me permitió:
- Aplicar principios de arquitectura limpia en el diseño de la aplicación.
- Integrar tecnologías modernas como Spring Boot y Flyway para una solución eficiente.
- Comprender la importancia de las pruebas en la entrega de software de calidad.
- Implementar autenticación y autorización en una API REST.
- Profundizar en el uso de Spring Security y JWT.
- Mejorar la estructura y seguridad de un proyecto backend.

Estoy emocionado por seguir aprendiendo y construyendo proyectos que reflejen mi crecimiento profesional y pasión por la tecnología.
---

## 🚀 Tecnologías Utilizadas

### Lenguajes y Frameworks
- **Java**
- **Spring Boot**: Desarrollo de aplicaciones robustas y escalables.
- **Spring Data JPA**: Persistencia de datos.
- **Flyway**: Migraciones de la base de datos.
- **Swagger**: Documentación interactiva de la API.

### Base de Datos
- **MySQL**: Almacenamiento y gestión de datos.

### Herramientas
- **IntelliJ IDEA**
- **Postman** / **Insomnia**: Pruebas de la API.
- **Trello**: Organización de tareas del proyecto.

### Testing
- **JUnit** y **Mockito**: Pruebas unitarias y de integración.

---

## 🛠️ Arquitectura del Proyecto

```
src/main/java/com/foro_hub_challenge
|
├── ForoHubChallengeApplication.java
|
├── dto
│   ├── TopicoDto.java
│   ├── NuevoTopicoRequest.java
│   ├── ActualizarTopicoRequest.java
│   ├── LoginRequest.java
│   ├── LoginResponse.java
│   ├── UsuarioDto.java
|
├── model
│   ├── Topico.java
│   ├── Autor.java
│   └── Curso.java
│   ├── Usuario.java
|
├── repository
│   ├── TopicoRepository.java
│   ├── AutorRepository.java
│   └── CursoRepository.java
│   ├── UsuarioRepository.java
|
├── service
│   ├── TopicoService.java
│   ├── AutorService.java
│   └── CursoService.java
│   ├── UsuarioService.java
│ 
├── security
│   ├── SecurityConfigurations.java
│   ├── AutenticacionController.java
│   ├── TokenService.java
│   ├── TokenFilter.java
│ 
├── controller
│   ├── TopicoController.java
|
└── config
    ├── SwaggerConfig.java
    └── FlywayConfig.java
```

---

## 🗂️ Diagrama de Base de Datos

### Tablas Principales
- **Topico**: Contiene información sobre los tópicos creados.
- **Autor**: Detalla los autores de los tópicos.
- **Curso**: Representa los cursos asociados a los tópicos.

### Relación entre Tablas
- Un **tópico** pertenece a un **autor**.
- Un **tópico** está asociado a un **curso**.

---

## 🌐 Endpoints de la API

#### Autenticación

Iniciar sesión

POST /login

Request Body:
```json
{
  "email": "usuario@example.com",
  "contrasena": "123456"
}
```
Response:
```json
{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}
```
#### Gestión de Usuarios

- **Crear un nuevo usuario**

POST /usuarios

- **Request Body:**
```json
{
  "nombre": "Juan Pérez",
  "email": "juan.perez@example.com",
  "contrasena": "123456"
}
```
- **Listar usuarios**

GET /usuarios (Protegido, requiere token)
### Tópicos

#### Crear un nuevo tópico
- **POST /topicos**
- **Request Body**:
  ```json
  {
    "titulo": "Nuevo Tópico",
    "mensaje": "Este es el mensaje del tópico",
    "autorId": 1,
    "cursoId": 1
  }
  ```

#### Listar todos los tópicos
- **GET /topicos**
- **Opcional**: Paginación y ordenamiento.

#### Detallar un tópico
- **GET /topicos/{id}**

#### Actualizar un tópico
- **PUT /topicos/{id}**
- **Request Body**:
  ```json
  {
    "titulo": "Tópico Actualizado",
    "mensaje": "Mensaje actualizado del tópico"
  }
  ```

#### Eliminar un tópico
- **DELETE /topicos/{id}**

---

## 🛠️ Instalación y Ejecución

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/jjclinares/foro-hub-challenge.git
   ```

2. Ejecutar las migraciones con Flyway.

3. Iniciar la aplicación:
   ```bash
   mvn spring-boot:run
   ```

4. Acceder a la documentación Swagger:
   - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

---
🔧 Estatus del Proyecto

Finalizado :black_nib:

## 👤 Autor

Proyecto desarrollado por Jamer Linares.

