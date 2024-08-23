public class Run{
    public static void main(String[] args){
        EdadException exPersonalizada = new EdadException();

        try{
            exPersonalizada.validarEdad(17);
        } catch(EdadException ex){
            //System.out.println("Se ejecuto la ex personalizada, Mensaje de la exception: " + ex.getMessage());
            ex.printStackTrace();
        } catch(Exception ex){
            System.out.println("Exception por default");
        }
    }
}