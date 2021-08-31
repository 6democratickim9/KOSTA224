package Chapter33;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AbstractDemo{
public static void main(String[] args) throws IOException {
    InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(inputStreamReader);	
    String line;
    while ((line = br.readLine()) != null) {
    	System.out.println(line);
    }
}
}