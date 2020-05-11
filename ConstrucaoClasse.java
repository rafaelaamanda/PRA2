import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "ocurrences")

public class Ocorrence {
     private int oId;
     private String oCreationDate;
     private String oDescription;
     private String oForwarding;
     private int oGrade;
    
@PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "ocurrenceId")
    private int oId;
    @Nullable
    @ColumnInfo(name = "ocurrenceDescription")
    private String oDescription;
    
    public int getId() {
          return oId; 
    }

    public void setId(@NonNull int id) {
        oId = id;
    }

    public String getDescription() {
        return oDescription;
    }

    public void setDescription(@Nullable String description) {
        oDescription = description;
    }

    public String getForwarding() {
        return oForwarding;
    }

    public void setForwarding(String forwarding) {
        oForwarding = forwarding;
    }

    public int getGrade() {
        return oGrade;
    }

    public void setGrade(int grade) {
        oGrade = grade;
    }

    public String getCreationDate() {
        return oCreationDate;
    }

    public void setCreationDate(String creationDate) {
        oCreationDate = creationDate;
    }
    private String oForwarding
    private String oCreationDate;
    public int getGrade() {
    return oGrade;
    }
    public void setGrade(int grade) {
    oGrade = grade;
    }
    private int oGrade;
    public Ocurrence(String description, String forwarding, int grade, String creationDate) {
        oDescription = description;
        oForwarding = forwarding;
        oGrade = grade;
        oCreationDate = creationDate;
    }
}
