<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Guía de Práctica de Laboratorio / Talleres / Centros de Simulación</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: GUIA-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DE LA PRÁCTICA:</td><td colspan="5">Revisión de elementos de programación (Parte I)</td></tr>
<tr>
<td>NÚMERO DE PRÁCTICA:</td><td>02</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA DE PRESENTACIÓN:</td><td></td><td>HORA DE PRESENTACIÓN:</td><td colspan="3"></td>
</tr>
<tr><td colspan="3">INTEGRANTE(s):
<ul>
<li>Carrillo Daza Barbara - bcarrillo@unsa.edu.pe</li>
<li>Hancco Condori Bryan - bhanccoco@unsa.edu.pe</li>
<li>Diaz Portillo Carlo Rodrigo - cdiazpor@unsa.edu.pe</li>
<li>Cárdenas Martines Franco - fcardenasm@unsa.edu.pe</li>
<li>Mamani Cañari Gabriel Anthony - gmamanican@unsa.edu.pe</li>
</ul>
</td>
<td>NOTA:</td><td colspan="2"></td>
</<tr>
<tr><td colspan="6">DOCENTE(s):
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tbody>
</table>

<table>
<theader>
<tr><th>Solución y resultados</th></tr>
</theader>
<tbody>
<tr><td>I. SOLUCIÓN DE EJERCICIOS/PROBLEMAS<br>
    SOLUCIÓN EJERCICIO 1: El problema planteaba invertir una matriz, para 
    eso usamos un bucle for, el cual recorría iterativamente los elementos de
    la matriz unidimensional y los agregaba a otra matriz vacía, lo que se cambió,
    es que la iteración iba desde el final del array hasta el principio, para así poder
    ver un array totalmente invertido.<br>
    [1,2,3,4,5] => [5,4,3,2,1]<br>
    SOLUCIÓN EJERCICIO 2: El ejercicio planteaba recorrer espacios a la izquierda el array,
    para lo cual, se usó también una iteración pero con condiciones. Si la posición del número
    menos el número de espacios a recorrer era mayor igual a 0, no habìa problema y tomaba la nueva
    posición pero si era un número negativo, significaba que iría al fondo del array, por eso se usó 
    el valor absoluto y se restó a la posición final del arreglo.<br>
    [1,2,3,4,5] d=3 => [4,5,1,2,3]<br>
    <pre>                                                                                          </pre>
    </td></tr>
<tr><td>II. SOLUCIÓN DEL CUESTIONARIO<br>
    ¿Qué diferencia hay entre un List y un ArrayList en Java?<br>
    <pre>La diferencia que encontramos entre un List y un ArrayList es que
List es una interface, mientras que ArrayList es una clase la cual 
implementa la interface List.
Entonces, ahora podemos responder:
¿Por qué <code>List &ltAnimal&gt mascotas = new List&ltAnimal&gt()</code> nos daba error?
List al ser una interface no puede ser instanciada, a diferencia de
la clase ArrayList, la cual si podemos crear objetos de ArrayList y
trabajar con ellos.</pre>
    ¿Qué beneficios y oportunidades ofrecen las clases genéricas en Java?<br>
    <pre>                                                                                         
El beneficio más detacable obtenido con el uso de clases genéricas se da
con la libre parametrización de tipos de valores en una determinada clase, permitiendonos	
operar con objetos de cualquier tipo, además de la libre personalización y la facilidad de
lectura e identificación código.
Las oportunidades que ofrecen son múltiples, pues nos permiten desarrollar código genérico
(clases, interfaces, métodos, etc), además de la aplicación de algoritmos que abarcan diferentes
tipos de datos.  </pre>
    </td></tr>
<tr><td>III. CONCLUSIONES<br>
    <li>La interface List nos da la posibilidad de tener un pleno control de los elementos que son insertados a una lista de una clase que implementa la interface list. Muy útil al momento de trabajar con estructuras de datos como podrían ser los arboles.</li>
<li>Los Generics en java nos resultan de gran ayuda a la hora de reutilizar, entender y operar en el código, gracias a los múltiples tipos de parametros que podemos ingresar.</li>
<li>Entendemos la recursión como un proceso en el cual una función se llama a sí misma y se vuelve a ejecutar, terminando la recursión cuando nos encontremos con el caso base.</li>
    </td></tr>
</tbody>
</table>


<table>
<theader>
<tr><th>RETROALIMENTACIÓN GENERAL
    </th></tr>
</theader>
<tbody>
<tr><td>
    <pre>                                                                                          </pre>
    <pre>                                                                                          </pre>
    </td></tr>
</tbody>
</table>
    
</div>    
<p><b>REFERENCIAS Y BIBLIOGRAFÍA</b></p>
<ul>
    <li>https://www.w3schools.com/java/</li>
    <li>https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers</li>
    <li>https://docs.oracle.com/javase/7/docs/api/java/util/List.html</li>
    <li>https://docs.oracle.com/javase/tutorial/java/generics/types.html</li>
</ul>

