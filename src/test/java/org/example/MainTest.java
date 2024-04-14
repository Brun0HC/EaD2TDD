package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("Testing if it is possible put side by side")
    void testSideBySide() {
        int paginaAltura = 10;
        int paginaLargura = 7;
        int fotoAltura = 4;
        int fotoLargura = 3;
        assertThat(fotoLargura * 2 <= paginaLargura && fotoAltura <= paginaAltura).isTrue();
    }
    @Test
    @DisplayName("Testing if it is possible to put on top of each other")
    void testOnTop() {
        int paginaAltura = 8;
        int paginaLargura = 5;
        int fotoAltura = 4;
        int fotoLargura = 3;
        assertThat(fotoLargura <= paginaLargura && fotoAltura * 2 <= paginaAltura).isTrue();
    }

    @Test
    @DisplayName("Testing if it is possible by rotating on of them")
    void testByRotating() {
        int paginaAltura = 7;
        int paginaLargura = 5;
        int fotoAltura = 4;
        int fotoLargura = 3;
        assertThat(fotoAltura <= paginaLargura && fotoLargura <= paginaAltura).isTrue();
    }

}