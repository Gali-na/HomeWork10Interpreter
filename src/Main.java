public class Main {
    public static void main(String[] args) {
        Interpreter interpreter = new Interpreter();
     interpreter.addNewWords("I", "Я");
        interpreter.addNewWords("like", "люблю");
        interpreter.addNewWords("my", "свою");
        interpreter.addNewWords("dog", "собакa");
        interpreter.addNewWords(".", ".");
        interpreter.addNewWords("live", "живу");
        interpreter.addNewWords("in", "в");
        interpreter.addNewWords("Kryvyi", "Кривом");
        interpreter.addNewWords("Rih", "Роге");
        interpreter.databaseСonnection();
        System.out.println(FileDataTranslation.TranslationWordsFromFile("Text.txt", interpreter.getInterpreter()));
        interpreter.addNewWords("the", "");
        interpreter.addNewWords("loves", "любит");
        interpreter.addNewWords("play", "играть");
        interpreter.addNewWords("to", "");
        System.out.println(FileDataTranslation.TranslationWordsFromFile("Text.txt", interpreter.getInterpreter()));
        interpreter.save();
    }
}
