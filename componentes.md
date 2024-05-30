# Componentes

1. **Actividades**: Las actividades son componentes de la interfaz de usuario que representan una sola pantalla con una interfaz de usuario. En este proyecto, habría actividades como:
   * **Inicio de Sesión y Registro**: Para permitir a los usuarios iniciar sesión o crear una nueva cuenta.
   * **Pantalla Principal (Home)**: Donde se muestra la bienvenida al usuario y las opciones principales de la aplicación.
   * **Crear Quiz**: Una actividad para que los usuarios creen sus propios quizzes.
   * **Jugar Quiz**: Donde se presentan las preguntas y opciones de respuesta, y se lleva a cabo la lógica del juego.
2. **Vistas**: Estos son los elementos visuales que se utilizan para construir la interfaz de usuario de cada actividad. Algunas vistas comunes incluirían:
   * **TextView**: Para mostrar texto, como mensajes de bienvenida o títulos de quizzes.
   * **EditText**: Para que los usuarios introduzcan texto, por ejemplo, al crear un nuevo quiz.
   * **Button**: Para permitir a los usuarios interactuar, como iniciar sesión, enviar respuestas en un quiz, etc.
   * **RecyclerView**: Para mostrar listas de quizzes disponibles, preguntas en un quiz, etc.
3. **Modelos de Datos**: Estos son objetos que representan los datos en la aplicación. En este proyecto, podrían incluir:
   * **Usuario**: Un objeto que representa la información del usuario, como el nombre de usuario, el correo electrónico, etc.
   * **Quiz**: Contiene información sobre un quiz específico, como el título, las preguntas y las respuestas.
   * **Pregunta**: Representa una pregunta individual en un quiz, con sus opciones de respuesta y la respuesta correcta.
4. **Firebase**: Este proyecto hace uso de Firebase para la autenticación de usuarios, almacenamiento de datos y posiblemente otras funcionalidades. Algunos de los componentes de Firebase que podrían utilizarse incluyen:
   * **Firebase Authentication**: Para gestionar la autenticación de usuarios.
   * **Cloud Firestore o Firebase Realtime Database**: Para almacenar y recuperar datos, como información de usuario, quizzes y preguntas.
5. **Controladores o Presentadores**: Estos son componentes que manejan la lógica de la aplicación y la interacción entre las vistas y los modelos de datos. Se encargan de cosas como manejar eventos de clic en botones, procesar respuestas de quizzes, etc.
