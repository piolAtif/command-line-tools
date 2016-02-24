import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingFile{
  public static void main(String[] args) throws FileNotFoundException, IOException{
    wcUtilities(args);
  };

public static String convertFileIntoString(String fileName) throws FileNotFoundException, IOException{
  File file = new File(fileName);
  String fileTexts = readFile(file);
  return fileTexts;

}

private static void wcUtilities(String []args) throws FileNotFoundException, IOException{
  int i = (args.length)-1;
  String file = convertFileIntoString(args[i]);
  if(args.length == 2){
    allInfoOfFile(file, args[1]);
  }else{
    String printInfo = giveCommand(file, args[2],args);

    System.out.println(printInfo);
  }
}

private static void allInfoOfFile(String fileTexts, String fileName){
  int lines = getLines(fileTexts);
  int words = getWords(fileTexts);
  int chars = getChars(fileTexts);
  System.out.println("\t"+lines+"\t"+words+"\t"+chars+" "+fileName);
}

private static String giveCommand(String fileTexts, String fileName, String []args) throws FileNotFoundException, IOException{
  String fileInfo = "";
  for (String command: args) {
    switch(command){
      case "-l" : fileInfo = "\t"+getLines(fileTexts)+" "+fileName;
      break;
      case "-w" : fileInfo = "\t"+getWords(fileTexts)+" "+fileName;
      break;
      case "-c" : fileInfo = "\t"+getChars(fileTexts)+ " "+fileName;
      break;
      default : read(command);
      break;
    }
  }
  return fileInfo;
}

private static void getMultipleFiles(String command) throws FileNotFoundException, IOException{
    String secondFileText = convertFileIntoString(fileName2);
    allInfoOfFile(secondFileText, fileName2);
    allInfoOfFile(firstFileText, fileName1);
};

  private static String readFile(File file) throws FileNotFoundException,IOException{
    String sCurrentLine = "";
    String text = "";

		BufferedReader br = new BufferedReader(new FileReader(file));

			while ((sCurrentLine = br.readLine()) != null) {
        if(sCurrentLine != null){
          text += sCurrentLine+"\n";
        }
      }
      return text;
  };

};
