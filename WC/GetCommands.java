public class getCommands{
    public int getLines(String text){
      WC wc = new WC(text);
      return wc.lines();
    };

    public int getChars(String text){
      WC wc = new WC(text);
      return wc.charLength();
    };

    public int getWords(String text){
      WC wc = new WC(text);
      return wc.words();
    };
};
