# 🖥️ Backend - Gestor de Tareas

Este es el **backend** del proyecto **Gestor de Tareas**, desarrollado en **Java 21 con Spring Boot**.  
Provee una API REST para gestionar tareas: crear, listar, editar, eliminar y marcar como completadas.

---

## ⚙️ Tecnologías utilizadas
- Java 21
- Spring Boot
- Maven
- IntelliJ IDEA
- H2 Database (en memoria) o configuración con otra base de datos

---

## ▶️ Cómo ejecutar

### 1. Clonar el repositorio
```bash
git clone https://github.com/blackgoku-97/gestor-tareas.git
cd gestor-tareas/backend
```

### 2. Compilar con Maven
```bash
mvn clean install
```
### 3. Ejecutar la aplicación
```bash
mvn spring-boot:run
El servidor se iniciará en:
en el puerto 8080
```

---

## 📡 Endpoints disponibles

### Obtener todas las tareas
```
GET /api/tasks
```

### Crear nueva tarea
```
POST /api/tasks
Body JSON:
{
"title": "Probar API",
"description": "Validar endpoints con Postman!",
"completed": false
}
```

### Editar tarea existente
```
PUT /api/tasks/{id}
Body JSON:
{
"title": "Título actualizado",
"description": "Descripción actualizada",
"completed": true
}
```

### Eliminar tarea
```
DELETE /api/tasks/{id}
```

---

## 🧪 Pruebas con Postman
```
1. Abrir Postman o Insomnia.
2. Crear una colección con los endpoints anteriores.
3. Probar el flujo completo:
   - Crear una tarea con POST /api/tasks.
   - Listar con GET /api/tasks.
   - Editar con PUT /api/tasks/{id}.
   - Eliminar con DELETE /api/tasks/{id}.
```

---

## 📂 Estructura del proyecto
```
backend/
├── src/main/java/com/example/tasks
│   ├── controller/TaskController.java
│   ├── model/Task.java
│   ├── repository/TaskRepository.java
│   └── service/TaskService.java
├── src/main/resources
│   └── application.properties
└── pom.xml
```

---

## 🛡️ .gitignore recomendado
```
# Maven / Java
target/
*.log
*.class
*.jar
*.war
*.iml

# IDEs
.idea/
.vscode/
.DS_Store
```

---

## 📌 Autor
```
Desarrollado por Ricardo
Ingeniero Informático freelance, especializado en backend/mobile y soluciones reproducibles.
```

---