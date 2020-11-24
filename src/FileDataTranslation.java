import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class FileDataTranslation {
    public static String TranslationWordsFromFile (String nameFile, Map<String,String> interpreter) {
        ArrayList<String> wordsFromFile=readTextOfFile(nameFile);
        String rezult="";
        for(String s:wordsFromFile) {
          if(interpreter.get(s)!=null) {
              rezult=rezult+interpreter.get(s) +" ";
          }else{
              rezult=rezult+"...."+" ";
          }
        }
        return rezult;
    }

    private static ArrayList<String> readTextOfFile(String nameFile) {
        String dataFtomFile = "";
        try (BufferedReader fileRead = new BufferedReader(new FileReader(nameFile))) {
            while (fileRead.read() != -1) {
                dataFtomFile = dataFtomFile + fileRead.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] arryEnglishWords = dataFtomFile.split(" ");
        ArrayList<String> englishWords = new ArrayList<>();
        Arrays.stream(arryEnglishWords)
                .forEach(x -> {
                    englishWords.add(x);
                });
        return  englishWords;
    }
}
