En esta actividad, vamos a implementar una jerarquía de clases utilizando la herencia en Java para representar diferentes tipos de transporte público en Colombia.

Objetivo:

Comprender los conceptos de herencia, superclases, subclases.
Implementar métodos para calcular la tarifa, la distancia recorrida y la duración del viaje.
Practicar el uso de modificadores de acceso (public, protected, private) y la palabra clave super.
Repositorio GitHub:

Crea un nuevo repositorio en GitHub llamado "herencia-transporte-colombia".
Instrucciones:

Paso 1: Superclase TransportePublico

Crea una clase llamada TransportePublico (en el archivo TransportePublico.java).
Define los siguientes atributos:
tipo (String)
ruta (String)
tarifa (double)
distanciaRecorrida (double)
tiempoRecorrido (int)
Define los siguientes métodos:
Un constructor que inicialice los atributos tipo y ruta.
calcularTarifa(): Calcula la tarifa del viaje.
calcularDistanciaRecorrida(): Calcula la distancia recorrida.
calcularTiempoRecorrido(): Calcula la duración del viaje en minutos.
Paso 2: Subclase Bus

Crea una clase llamada Bus (en el archivo Bus.java) que herede de TransportePublico.
Añade un atributo capacidad (int).
Implementa un método llamado calcularTarifaBus().
Agrega un método mostrarInformacion() que muestre los detalles del autobús.
Paso 3: Subclase Metro

Crea una clase llamada Metro (en el archivo Metro.java) que herede de TransportePublico.
Añade un atributo numeroEstaciones (int).
Implementa un método separado llamado calcularTarifaMetro().
Agrega un método mostrarMapa().
Paso 4: Subclase Transmilenio

Crea una clase llamada Transmilenio (en el archivo Transmilenio.java) que herede de TransportePublico.
Añade un atributo numeroParadas (int).
NO redefine el método calcularTarifa(). En su lugar, implementa un método separado llamado calcularTarifaTransmilenio().
Agrega un método mostrarRuta().
Paso 5: Prueba la herencia

Crea una clase Main (en el archivo Main.java) para probar las clases:
Crea un objeto Bus, un objeto Metro y un objeto Transmilenio.
Inicializa los atributos de los objetos.
Llama a los métodos específicos de cada objeto para comprobar su comportamiento.
Pistas:

Investiga sobre las características de cada tipo de transporte público en Colombia.
Implementa la lógica de cálculo de tarifas, distancia y tiempo de forma realista.
Utiliza los modificadores de acceso apropiados para los atributos y métodos.
Ten en cuenta la visibilidad de los miembros heredados.
Utiliza la palabra clave super para acceder a los métodos y atributos de la superclase cuando sea necesario.
