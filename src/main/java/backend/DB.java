/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
//IMPORTS 
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;
import com.mongodb.client.MongoDatabase;


/**
 *
 * @author dell
 */
public class DB {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public boolean establecerConexion() {
        try {
            // Intentar la conexión a MongoDB
            MongoClientURI uri = new MongoClientURI(getMongoDBUri());
            mongoClient = new MongoClient(uri);

            // Acceso a la base de datos
            database = mongoClient.getDatabase("dbPractica");
            System.out.println("Conexión exitosa a la base de datos");
            return true;
        } catch (MongoException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
            return false;
        }
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void cerrarConexion() {
        // Cerrar la conexión en un bloque finally para asegurarse de que se cierre incluso si hay una excepción
        try {
            if (mongoClient != null) {
                mongoClient.close();
                System.out.println("Conexión cerrada");
            }
        } catch (Exception e) {
            System.err.println("Error al cerrar la conexión: " + e.getMessage());
        }
    }

    private String getMongoDBUri() {
        // Puedes implementar una lógica para obtener la URI de MongoDB de forma segura,
        // como desde un archivo de configuración o una variable de entorno.
        return "mongodb+srv://dev:1104264112@cluster.bu7zten.mongodb.net/dbPractica?retryWrites=true&w=majority";
    }
}