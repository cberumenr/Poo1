package _p102_AutorLibro;

public class app {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        Autor autor = new Autor();
        
        autor.setNombre("Baldur");
        autor.setCorreo("Baldur@gmail.com");
        libro1.setIsbn("1005491");
        libro1.setNombre("Algebra para principiantes");
        libro1.setPrecio(1500);
        libro1.setCant(10);
        libro1.setAutor(autor);
        System.out.println(libro1);

        Libro libro2 = new Libro("15602105", "Me before you", new Autor("Jose Jose", "Jose@gmail.com"), 850, 5);
        System.out.println(libro2);
    }

    
}
