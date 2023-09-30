# Actividad6 - padronv3

El proyecto consistía en aprender cómo hacer leer datos de un fichero CSV, para posteriormente desarrollar una
sencilla interfaz de usuario. Desde ella se podrían introducir nombres que el programa se encargaría de guardar en
ese mismo archivo CSV.

También se organizaron las clases en paquetes, utilizando el comando package. A causa de esto, las clases que
no se encontraban en el mismo paquete no se podían ver entre si. Por ello, fue necesario realizar imports en
cada clase.

Finalmente se requería ejecutar el programa desde la consola de Linux. Para ello se creó una clase "Principal"
en un paquete "aplicacion", que mandaba ejecutar la clase InterfazUsuario. Posteriormente, ya en la consola de
comandos, se creó el directorio "bin" y se compilaron los archivos .Java dentro del mismo.

Ahora se puede ejecutar el pograma desde la consola.
Mediante el comando "java -cp bin aplicacion.Principal anadir Alvaro Garcia Gonzalez" (¡"anadir" con "n"!), el programa añade un
nuevo habitante al archivo CSV con el nombre indicado.
Se puede comprobar con el comando "java -cp bin aplicacion.Principal mostrar".
