import java.util.Arrays;

public class PR0CypherCaesarArray {
    int capacity = 52;
    char[] vector = new char[capacity];
    String msg = "Data structures are cool and essential for computing";  //missatge a xifrar

    public PR0CypherCaesarArray(String msg){
        this.msg = msg;
        int desp = 25;  //desplaçament
        System.out.println("encrypt: "+cypher(desp));   //cadena de caràcters
        System.out.println("encrypt: "+ Arrays.toString(cypher2Array(desp)));  //vector
    }

    public char[] cypher2Array(int desp){

        for(int i = 0; i < msg.length(); ++i){

            char ch = msg.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + desp);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }
                vector[i] = ch;

            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + desp);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                vector[i] = ch;
            }
            else {
                vector[i] = ch;
            }
        }
        System.out.println(vector);
        return vector;
    }

    public String cypher(int desp) {

        String encryptedMsg = "";

        for(int i = 0; i < msg.length(); ++i){
            char ch = msg.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch = (char)(ch + desp);

                if(ch > 'z'){
                    ch = (char)(ch - 'z' + 'a' - 1);
                }

                encryptedMsg += ch;
            }
            else if(ch >= 'A' && ch <= 'Z'){
                ch = (char)(ch + desp);

                if(ch > 'Z'){
                    ch = (char)(ch - 'Z' + 'A' - 1);
                }

                encryptedMsg += ch;
            }
            else {
                encryptedMsg += ch;
            }
        }

        return encryptedMsg;
    }

}
