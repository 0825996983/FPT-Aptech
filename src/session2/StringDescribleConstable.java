package session2;

import  java.util.Optional;
public class StringDescribleConstable {
    public static void main(String[] args) {
        String str =  "Life is short and we shoud  respect every moment of it. ";
        Optional<String> optStr = str.describeConstable();
    optStr.ifPresent (value ->{
            System.out.println("Value:" +optStr.get());

        });
    }
}