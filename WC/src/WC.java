public class WC{
  String text;
  public WC(String text){
    this.text = text;
  };

  public int charLength(){
    String []tokens =  text.split("\\n");
    int length = 0;
    for(String s:tokens){
      length += s.length();
    }
    return length;
  };

  public int words(){
      String []tokens = text.split(" ");
      int length = 0;
      for (String s : tokens) {
        length++;
      }
      return length;
  }

  public int lines(){
    String []tokens = text.split("\\n");
    int length = 0;
    for (String s : tokens) {
      length++;
    }
    return length;
  }

}
