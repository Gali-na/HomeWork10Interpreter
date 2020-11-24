import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Interpreter implements Serializable {
    private Map<String, String> interpreter;

    public Interpreter() {
        this.interpreter = new HashMap<>();
    }

    public Map<String, String> getInterpreter() {
        return interpreter;
    }

    public void addNewWords(String englishWord, String russianWord) {
        if (this.interpreter.containsKey(englishWord)) {
            System.out.println("This word already exists in the translator, the addition will not be performed");
            return;
        }
        interpreter.put(englishWord, russianWord);
        System.out.println("Translation added successfully");
    }

    public void save() {
        try (ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("fil"))) {
            OOS.writeObject(this.interpreter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void databaseСonnection() {
        try (ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("fil"))) {
            this.interpreter = (Map<String, String>) OIS.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
