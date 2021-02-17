Una cajera tiene que atender a cualquier persona que llegue a su caja exactamente en el orden de llegada, estas personas pueden ser ancianos, niños, jóvenes, mujeres embarazadas o con niños.

Cree una interface persona, que tendrá los siguientes métodos: 
public String nombrePersonaEnCaja(); 
public String apellidoPersonaEnCaja (); 
public int numeroDeNit(); 

Cree una clase PersonaMayor, una clase MujerEmbarazada, una clase Adulto y una clase Joven que tendrán como atributo:

nombre, apellido, numero de nit 

El número de nit por defecto debe tener el valor: 00000000000000 

Estas clases deben implementar la interfaz persona.

Cree una clase cajera que tendrá en ella el nombre, apellido, código de registro de la cajera (código de personal),y tendrá que facturar los productos que está llevando la persona que está siendo atendida, para ello debe pedir los datos de la persona que está siendo atendida y el número del nit, si el número de nit no es de la persona que está siendo atendida tendrá que pedir los datos de la persona a la que corresponde el nit. 

La cajera debe poder visualizar el nombre de las personas en la cola,( para este método se debe imprimir en pantalla uno por uno los nombres de las personas que serán atendidas).

La cajera puede preguntar quién será el siguiente en ser atendido, si no hay nadie en la cola debe de mostrarle un mensaje que diga “no hay persona en la cola”.

Debe de ser capaz de sacar a la siguiente persona en la cola en caso de ser necesario(en ocasiones las personas muestran un comportamiento impropio para el lugar en que se encuentra ), pero se debe verificar que la cola no esté vacía, en caso de estarlo debe mostrar el mensaje “no hay persona en la cola”.

Debe de poder sacar a alguien de la cola con el nombre(basta con que sea el primero en la cola con ese nombre)si no hay nadie con ese nombre debe de mostrar el mensaje: “La persona no se encuentra en la cola”.

La cajera debe de pedir que pase la siguiente persona para ser atendida, si la cola se encuentra vacía, debe de mostrar un mensaje que diga “no hay persona en la cola”.

La cajera debe poder preguntar cuántas personas hay en la cola.

Cree una clase producto la cual tendrá como atributo: 

Nombre de producto Código de producto 

La factura debe de ser impresa con los datos de la cajera, los datos de la persona que está siendo atendida, el número de nit, los datos de la persona dueña del nit(en caso de que sea una persona diferente de la que se está atendiendo), la lista de los productos(código y precio) que se están comprando y el monto total de la factura.

Factura puede ser un método o una clase. Todas las clases deben ir con sus getter, setter y constructores correspondientes