import java.util.List;
import java.util.Timer;
import org.sql2o.*;
import java.sql.Timestamp;

public class Sighting {
    private int animal_id;
    private String rangers_name;
    private int id;
    private String location;
    private Timestamp date;

    public Sighting(int animal_id, String rangers_name, int id, String location, Timestamp date) {
        this.animal_id = animal_id;
        this.rangers_name = rangers_name;
        this.id = id;
        this.location = location;
        this.date = date;
    }
    public int getAnimal_id(){
        return animal_id;
    }
    public String getRangers_name(){
        return rangers_name;
    }
    public String getLocation(){
        return location;
    }

    public int getId() {
        return id;
    }
    public Timestamp getDate(){
        return date;
    }


}
