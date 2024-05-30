# Pasos para la creación y dificultades

Paso 1: **Configuración del Proyecto**

* Configuramos un nuevo proyecto en Android Studio con compatibilidad para Jetpack Compose.
* Agregamos las dependencias necesarias en el archivo `build.gradle`.
* Configuramos el entorno de desarrollo para trabajar con Jetpack Compose.

Dificultad: Integrar Relay en el proyecto presentó desafíos significativos debido a su naturaleza nueva y al ser una metodología que tiene muy tiempo desde su creación. No obstante pudemos customizar muchas de los componentes que aportaba el Relay y conseguimos que el diseño y la aplicación final tuvieran el mismo aspecto.

Paso 2: **Diseño de la Interfaz de Usuario basado en Figma**

* Utilizamos el diseño del mockup creado en Figma como referencia para diseñar la interfaz de usuario de la pantalla de creación de quizzes.
* Creamos un formulario que permite a los usuarios ingresar el título del quiz, así como las preguntas y respuestas asociadas.
* Nos aseguramos de que la interfaz de usuario fuera coherente con el diseño y las directrices de diseño establecidas en el mockup.

Dificultad: Aunque el diseño del mockup en Figma proporcionó una guía clara para la apariencia de la interfaz de usuario, surgieron desafíos al traducir este diseño a componentes funcionales utilizando Relay y Jetpack Compose. Para ello tuvimos que crear nuevos componentes desde la aplicación con Jetpack Compose a mano, fijándonos en los componentes que nos facilitó el Relay de Figma.

Paso 3: **Implementación de la Lógica de Negocio**

* Implementamos la lógica necesaria para procesar los datos ingresados por el usuario al crear un quiz.
* Validamos los datos ingresados para garantizar que el título del quiz y las preguntas tengan la información requerida.
* Utilizamos Firebase para almacenar los quizzes creados por los usuarios.

Dificultad: Integrar la lógica de negocio con Firebase presentó desafíos debido a la curva de aprendizaje asociada con la utilización de Firebase junto con Jetpack Compose. Se requirió tiempo adicional para comprender cómo interactuar correctamente con la base de datos y asegurar una integración sin problemas con la aplicación.

Paso 4: **Pruebas y Depuración**

* Realizamos pruebas exhaustivas de la funcionalidad de creación de quizzes para detectar y corregir errores.
* Utilizamos herramientas de depuración para identificar y solucionar cualquier problema encontrado durante el proceso de desarrollo.
* Realizamos pruebas de integración con Firebase para garantizar que los quizzes se almacenen y recuperen correctamente.

Dificultad: Durante las pruebas, encontramos algunos errores inesperados relacionados con la comunicación entre la aplicación y Firebase. Estos problemas requerían una cuidadosa depuración para identificar y resolver las causas subyacentes.

A pesar de las dificultades encontradas, se consiguió crear con éxito la funcionalidad de creación de quizzes utilizando Jetpack Compose y Relay, manteniendo la coherencia con el diseño del mockup en Figma.
