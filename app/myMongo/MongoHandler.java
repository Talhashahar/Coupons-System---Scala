package myMongo;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;


public class MongoHandler{
    private MongoClient mongoClient = new MongoClient("localhost");;
    private MongoDatabase database = mongoClient.getDatabase("Copuns");
    private MongoCollection<Document> coll =  database.getCollection("Copuns");


    public List<Document> getAllDocuments(){
        List<Document> docs = new ArrayList<>();
        this.database = mongoClient.getDatabase("Copuns");
        this.coll = database.getCollection("Copuns");
        MongoCursor<Document> cursor = this.coll.find().iterator();
        try {
            while (cursor.hasNext()) {
                docs.add(cursor.next());
            }
        } finally {
            cursor.close();
            return docs;
        }
    }
}
