package br.com.bruno.spring_boot_test;

import br.com.bruno.spring_boot_test.controller.TestController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnitTestController {

    @Test
    public void unitTest() {
        TestController controller = new TestController();
        String resultado = controller.saudacao("Bruno");
        Assertions.assertEquals("Bem-vindo, Bruno", resultado);
    }
}
