import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadUsingRead{
  public static void main(String[] args) throws FileNotFoundException,IOException{
    File file = new File(args[0]);
    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    String text="";
    String data="";
    while(data!=null){
      data = br.readLine();
      if (data!=null) {
        text+=data;
      }
    };
    System.out.println(text);
    // char a[] = new char[length];
    // fr.read(a,0,length);
  }
}
