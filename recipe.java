/**
*   chanharabomber
*   レシピデータをテキストファイルから読み込んで
*   表示するプログラム
**/

//fileIO処理のためのクラスのimport
import java.io.*;

1
class recipe {

  public static void main(String[] args) {

    try {

      File recipeFile = new File("" + args[0] );
      BufferedReader br = new BufferedReader(new FileReader(recipeFile));
      String readLine = br.readLine();
      while(readLine != null) {
          System.out.println(readLine);
          
          readLine = br.readLine();
      }
      
      br.close();

    } catch(FileNotFoundException e) {
      System.out.println(e);
    } catch(IOException e) {
      System.out.println(e);
    }

  }

}
