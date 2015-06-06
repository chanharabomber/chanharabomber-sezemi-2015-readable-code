/**
*   chanharabomber
*   レシピデータをテキストファイルから読み込んで
*   表示するプログラム
**/

//fileIO処理のためのクラスのimport
import java.io.*;


class recipe {

  public static void main(String[] args) {

    try {

      File recipeFile = new File("" + args[0] );
      BufferedReader br = new BufferedReader(new FileReader(recipeFile));
      String readLine = br.readLine();
      
      int recipeId = 1; //レシピIDは1から
     
      while(readLine != null) {
          System.out.println("" + recipeId +  ": " +readLine);
          recipeId++;
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
