package Cine;

public class Matriz {
     String[][] matriz ={
             {"8A","8B","8C","8D","8E","8F","8G","8H","8I"},
             {"7A","7B","7C","7D","7E","7F","7G","7H","7I"},
             {"6A","6B","6C","6D","6E","6F","6G","6H","6I"},
             {"5A","5B","5C","5D","5E","5F","5G","5H","5I"},
             {"4A","4B","4C","4D","4E","4F","4G","4H","4I"},
             {"3A","3B","3C","3D","3E","3F","3G","3H","3I"},
             {"2A","2B","2C","2D","2E","2F","2G","2H","2I"},
             {"1A","1B","2C","2D","2E","2F","2G","2H","2I"},

     };

    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }
}