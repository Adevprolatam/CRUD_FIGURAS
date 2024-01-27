/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
/**
 *
 * @author dell
 */

public class FiguraCRUD {
    private final MongoCollection<Document> coleccionCirculos;
    private final MongoCollection<Document> coleccionCuadrados;
    private final MongoCollection<Document> coleccionTriangulos;
    private int indiceCirculos;
    private int indiceCuadrados;
    private int indiceTriangulos; 
    private int obtenerUltimoIndice(MongoCollection<Document> coleccion) {
        long count = coleccion.countDocuments();
        return (int) count;
    } 
    
    // CONSTRUCTOR
    public FiguraCRUD(MongoDatabase database) {
        if (database != null) {
            coleccionCirculos = database.getCollection("Circulo");
            coleccionCuadrados = database.getCollection("Cuadrado");
            coleccionTriangulos = database.getCollection("Triangulo");

            indiceCirculos = obtenerUltimoIndice(coleccionCirculos) + 1;
            indiceCuadrados = obtenerUltimoIndice(coleccionCuadrados) + 1;
            indiceTriangulos = obtenerUltimoIndice(coleccionTriangulos) + 1;
        } else {
            throw new IllegalArgumentException("La base de datos no puede ser nula");
        }
    }
    
    //CIRCULO
    // CREATE
     public double insertarCirculo(double radio) {
        try {
            
            if (coleccionCirculos != null) {
                  Circulo circulo = new Circulo(radio);
                  double area = circulo.calcularArea();

                  Document documentoCirculo = new Document("figura", "Circulo")
                    .append("indice", indiceCirculos++)
                    .append("radio", radio)
                    .append("area", area);

                coleccionCirculos.insertOne(documentoCirculo);
                System.out.println("Círculo insertado en la base de datos");
                return area;
            } else {
                System.err.println("La colección de círculos es nula");
            }
          
        } catch (MongoException e) {
            System.err.println("Error al insertar círculo en la base de datos: " + e.getMessage());
        }
        return 0.00;
    }
    // DELETE
    public void eliminarColeccionCirculo() {
        try {
            // Eliminar todos los documentos de la colección de círculos
            coleccionCirculos.deleteMany(new Document());
            System.out.println("Colección de Círculos eliminada en la base de datos");
        } catch (MongoException e) {
            System.err.println("Error al eliminar la colección de círculos: " + e.getMessage());
         }
     }
    // GET
    public List<Circulo> obtenerListaCirculos() {
        List<Circulo> listaCirculos = new ArrayList<>();

    try {
        if (coleccionCirculos != null) {
            // Realizar la consulta para obtener todos los documentos en la colección
            FindIterable<Document> cursor = coleccionCirculos.find();

            // Recorrer el cursor y construir la lista de círculos
            MongoCursor<Document> iterator = cursor.iterator();
            while (iterator.hasNext()) {
                Document documentoCirculo = iterator.next();

                // Obtener los datos del documento
                double radio = documentoCirculo.getDouble("radio");
                double area = documentoCirculo.getDouble("area");
                int indice = documentoCirculo.getInteger("indice");
                // Crear un objeto Circulo y agregarlo a la lista
                Circulo circulo = new Circulo(radio);
                circulo.setArea(area);
                circulo.setIndice(indice);
                listaCirculos.add(circulo);
            }

            // Cerrar el cursor
            iterator.close();
        } else {
            System.err.println("La colección de círculos es nula");
        }
    } catch (MongoException e) {
        System.err.println("Error al obtener la lista de círculos: " + e.getMessage());
    }

        return listaCirculos;
    }    

    //CUADRADO
    //CREATE
    public double insertarCuadrado(double lado) {
        try {
            Cuadrado cuadrado = new Cuadrado(lado);
            double area = cuadrado.calcularArea();

            Document documentoCuadrado = new Document("figura", "Cuadrado")
                    .append("indice", indiceCuadrados++)
                    .append("lado", lado)
                    .append("area", area);

            coleccionCuadrados.insertOne(documentoCuadrado);

            System.out.println("Cuadrado insertado en la base de datos");
            return area;
        } catch (MongoException e) {
            System.err.println("Error al insertar cuadrado en la base de datos: " + e.getMessage());
        }
        return 0.00;
    }
    // DELETE
    public void eliminarColeccionCuadrado() {
        try {
            coleccionCuadrados.deleteMany(new Document());
            System.out.println("Colección de Cuadrados eliminada en la base de datos");
        } catch (MongoException e) {
            System.err.println("Error al eliminar la colección de círculos: " + e.getMessage());
         }
     }
    // GET 
    public List<Cuadrado> obtenerListaCuadrado() {
        List<Cuadrado> listaCuadrado = new ArrayList<>();

    try {
        if (coleccionCuadrados != null) {
            // Realizar la consulta para obtener todos los documentos en la colección
            FindIterable<Document> cursor = coleccionCuadrados.find();

            // Recorrer el cursor y construir la lista de círculos
            MongoCursor<Document> iterator = cursor.iterator();
            while (iterator.hasNext()) {
                Document documentoCuadrado = iterator.next();

                // Obtener los datos del documento
                double lado = documentoCuadrado.getDouble("lado");
                double area = documentoCuadrado.getDouble("area");
                int indice = documentoCuadrado.getInteger("indice");
                // Crear un objeto Circulo y agregarlo a la lista
                Cuadrado cuadrado = new Cuadrado(lado);
                cuadrado.setLado(lado);
                cuadrado.setArea(area);
                cuadrado.setIndice(indice);
                listaCuadrado.add(cuadrado);
            }

            // Cerrar el cursor
            iterator.close();
        } else {
            System.err.println("La colección de cuadrados es nula");
        }
    } catch (MongoException e) {
        System.err.println("Error al obtener la lista de cuadrados: " + e.getMessage());
    }

        return listaCuadrado;
    }  
    //TRIANGULO
    //CREATE
    public double insertarTriangulo(double base,double altura) {
        try {
            Triangulo triangulo = new Triangulo(base,altura);
            double area = triangulo.calcularArea();

            Document documentoTriangulo = new Document("figura", "Triangulo")
                    .append("indice", indiceTriangulos++)
                    .append("base", base)
                    .append("altura", altura)
                    .append("area", area);

            coleccionTriangulos.insertOne(documentoTriangulo);

            System.out.println("Triangulo insertado en la base de datos");
            return area;
        } catch (MongoException e) {
            System.err.println("Error al insertar triangulo en la base de datos: " + e.getMessage());
        }
        return 0.00;
    }
    // DELETE
    public void eliminarColeccionTriangulos() {
        try {
            coleccionTriangulos.deleteMany(new Document());
            System.out.println("Colección de Triangulos eliminada en la base de datos");
        } catch (MongoException e) {
            System.err.println("Error al eliminar la colección de círculos: " + e.getMessage());
         }
     } 
    // GET
     public List<Triangulo> obtenerListaTriangulos() {
        List<Triangulo> listaTriangulos = new ArrayList<>();

    try {
        if (coleccionTriangulos != null) {
            // Realizar la consulta para obtener todos los documentos en la colección
            FindIterable<Document> cursor = coleccionTriangulos.find();

            // Recorrer el cursor y construir la lista de círculos
            MongoCursor<Document> iterator = cursor.iterator();
            while (iterator.hasNext()) {
                Document documentoTriangulo = iterator.next();

                // Obtener los datos del documento
                double base = documentoTriangulo.getDouble("base");
                double altura = documentoTriangulo.getDouble("altura");
                double area = documentoTriangulo.getDouble("area");
                int indice = documentoTriangulo.getInteger("indice");
                // Crear un objeto Circulo y agregarlo a la lista
                Triangulo triangulo = new Triangulo(base,altura);
                triangulo.setArea(area);
                triangulo.setBase(base);
                triangulo.setAltura(altura);
                triangulo.setIndice(indice);
                listaTriangulos.add(triangulo);
            }

            // Cerrar el cursor
            iterator.close();
        } else {
            System.err.println("La colección de cuadrados es nula");
        }
    } catch (MongoException e) {
        System.err.println("Error al obtener la lista de cuadrados: " + e.getMessage());
    }

        return listaTriangulos;
    }  

}

