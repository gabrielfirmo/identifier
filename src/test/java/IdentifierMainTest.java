import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class IdentifierMainTest {

    static private ByteArrayOutputStream baOut;
    static private PrintStream psOut;

    @BeforeAll
    public static void beforeClassInit(){
        baOut = new ByteArrayOutputStream();
        psOut = new PrintStream(baOut);
        System.setOut(psOut);
    }

    @AfterAll
    public static void afterAllFinalize(){
        psOut.close();
    }

    @BeforeEach
    public void setUp(){
        baOut.reset();
    }

    @Test
    public void testeValido01(){
        IdentifierMain.main(new String[]{"a1"});
        String output = baOut.toString();

        assertEquals("Valido", output);
    }

    @Test
    public void testeInvalido02(){
        IdentifierMain.main(new String[]{"2b3"});
        String output = baOut.toString();

        assertEquals("Invalido", output);
    }

    @Test
    public void testeInvalido03(){
        IdentifierMain.main(new String[]{"z-12"});
        String output = baOut.toString();

        assertEquals("Invalido", output);
    }

    @Test
    public void testeInvalido04(){
        IdentifierMain.main(new String[]{"a1b2c3d"});
        String output = baOut.toString();

        assertEquals("Invalido", output);
    }



}
