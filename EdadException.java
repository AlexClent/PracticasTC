public class EdadException extends Exception{
    
    // public static final long serialVersionUID = 700L;

    public EdadException(){

    }

    public EdadException(String mensaje){
        super(mensaje);
    }

    public void validarEdad(int edad) throws EdadException{
        if(edad<18 && edad>=0){
            throw new EdadException("Error de edad");//Esta instrucción es la que lanzará el error para que la máquina de java pueda
                                                    //ver que existe una exception que necesita tratamiento de un try, catch, utilizamos el constructor
                                                    //para establecer el mensaje de error. ES LA LINEA MÁS IMPORTANTE.
        }
    }
}