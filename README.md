# 🏗️ Patrones de Diseño en Java: Singleton y Builder

Este repositorio contiene la implementación de los patrones de diseño **Singleton** y **Builder** en Java, demostrados mediante ejemplos prácticos en proyectos separados.

## 📌 Contenido

El repositorio se estructura en dos carpetas principales:

1. **3.1_Patterns.1/** → Implementación del patrón Singleton.
2. **3.2_Patterns.2/Level1/** → Implementación del patrón Builder.

---

## 🏆 3.1_Patterns.1 - Singleton

### 📖 Descripción

Se ha desarrollado una clase que simula el funcionamiento del comando `Undo`, permitiendo almacenar, eliminar y listar las últimas órdenes ingresadas. Este historial de comandos se gestiona mediante una clase `Undo`, la cual sigue el patrón **Singleton** para asegurar que solo exista una única instancia en toda la aplicación.

### ⚙️ Características

- **Patrón Singleton**: Se garantiza una única instancia de `Undo`.
- **Gestión de historial**: Se pueden agregar, eliminar y listar comandos.
- **Simulación de `history` en Linux**: Se mantiene un registro de los últimos comandos ingresados.

### 🚀 Ejecución

El proyecto cuenta con una clase `Main` que permite interactuar con `Undo` mediante consola, probando su funcionalidad.

**Comandos disponibles:**
```
1. Agregar comando
2. Eliminar último comando
3. Mostrar historial
4. Salir
```

---

## 🏆 3.2_Patterns.2/Level1 - Builder

### 📖 Descripción

Se ha desarrollado un sistema de gestión de pedidos de pizza utilizando el **patrón Builder** en Java. Este sistema permite la creación de diferentes tipos de pizzas con configuraciones personalizadas de tamaño, tipo de masa e ingredientes.

### ⚙️ Características

- **Clase `Pizza`** con atributos:
  - `size` (tamaño)
  - `dough` (tipo de masa)
  - `toppings` (ingredientes)
- **Interfaz `PizzaBuilder`** con métodos para configurar la pizza.
- **Constructores concretos** para diferentes tipos de pizzas (ej. hawaiana, vegetariana, etc.).
- **Clase `MestrePizzer`**, encargada de construir las pizzas con un `PizzaBuilder`.

### 🚀 Ejecución

El proyecto cuenta con una clase `Main` que permite crear diferentes tipos de pizzas con el Builder.

**Ejemplo de uso:**
```java
MestrePizzer mestrePizzer = new MestrePizzer(new HawaianaBuilder());
Pizza pizza = mestrePizzer.prepararPizza();
System.out.println(pizza);
```

---

## 📂 Estructura del repositorio

```
/
├── 3.1_Patterns.1/              # Proyecto Singleton
│   ├── src/
│   ├── Undo.java
│   ├── Main.java
│   ├── README.md
│   └── ...
│
├── 3.2_Patterns.2/Level1/       # Proyecto Builder
│   ├── src/
│   ├── Pizza.java
│   ├── PizzaBuilder.java
│   ├── MestrePizzer.java
│   ├── Main.java
│   ├── README.md
│   └── ...
│
└── README.md                    # Documentación general
```

---

## 🚀 Instalación y Ejecución

### 1️⃣ Clonar el repositorio
```
git clone https://github.com/tu_usuario/tu_repositorio.git
cd tu_repositorio
```

### 2️⃣ Ejecutar el proyecto Singleton
```
cd 3.1_Patterns.1
javac -d bin src/*.java
java -cp bin Main
```

### 3️⃣ Ejecutar el proyecto Builder
```
cd 3.2_Patterns.2/Level1
./gradlew build
./gradlew run
```

---

## 📖 Recursos Utilizados

1. [Documentación oficial de Java Singleton](https://refactoring.guru/es/design-patterns/singleton)
2. [Guía de diseño de Builder en Java](https://refactoring.guru/es/design-patterns/builder)

---

