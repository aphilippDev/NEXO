# Nexo

Aplicación multifuncional para organizar notas en markdown, tareas y calendario.
Es un proyecto personal para aprender, que irá creciendo por módulos.

## Estado

Versión `0.1.0-SNAPSHOT` (alfa, en desarrollo). Por ahora solo existe el proyecto base
y todavía no hay nada que usar. Avance de la versión 0.1, que trabaja solo el módulo de notas:

- [x] Proyecto Maven configurado con Java 25
- [ ] Clase `Nota`
- [ ] Guardar y listar notas (en memoria)
- [ ] Ver, editar y borrar notas
- [ ] Menú por consola

## Lo que viene

Nexo se construye por versiones pequeñas:

1. Notas por consola, en memoria (en curso)
2. Guardado en base de datos SQLite
3. API con Spring Boot
4. Primer frontend web (HTML, CSS y JS)
5. Módulos de tareas y calendario
6. Pulido y versión de escritorio

Los planes pueden cambiar a medida que el proyecto avance.

## Requisitos

- Java 25 (probado con Temurin)
- Maven 3.10 o superior

## Cómo ejecutarlo

```bash
git clone <url-del-repositorio>
cd Nexo
mvn compile
java -cp target/classes com.nexo.Main
```

De momento solo imprime un mensaje de prueba.