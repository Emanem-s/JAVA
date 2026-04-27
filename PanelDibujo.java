import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PanelDibujo extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        // Dimensiones de cada cuadrante
        int w = width / 2;
        int h = height / 2;

        // Número de líneas por figura

        int lineas = 10;

        // Dibujar las líneas divisorias de los cuadrantes
        g.setColor(Color.LIGHT_GRAY);
        g.drawLine(w, 0, w, height);
        g.drawLine(0, h, width, h);
        g.setColor(Color.BLACK);

        // --- 1. Arriba Izquierda: Despliegue desde una esquina ---
        for (int i = 0; i <= lineas; i++) {
            int x1 = 0;
            int y1 = 0;
            int x2 = i * (w / lineas);
            int y2 = i * (h / lineas);

            g.drawLine(x1, y1, x2, h); // Abanico hacia abajo
            g.drawLine(x1, y1, w, y2); // Abanico hacia la derecha
        }

        // 2. Arriba Derecha: Patrón complejo simétrico
        int offsetX = w; // Desplazamiento para el segundo cuadrante
        for (int i = 0; i <= lineas; i++) {
            int pasoW = i * (w / lineas);
            int pasoH = i * (h / lineas);

            // Esquina superior izquierda (relativa al cuadrante)
            g.drawLine(offsetX, 0, offsetX + pasoW, h);
            g.drawLine(offsetX, 0, offsetX + w, pasoH);

            // Esquina superior derecha
            g.drawLine(offsetX + w, 0, offsetX + w - pasoW, h);
            g.drawLine(offsetX + w, 0, offsetX, pasoH);

            // Esquina inferior izquierda
            g.drawLine(offsetX, h, offsetX + pasoW, 0);
            g.drawLine(offsetX, h, offsetX + w, h - pasoH);

            // Esquina inferior derecha
            g.drawLine(offsetX + w, h, offsetX + w - pasoW, 0);
            g.drawLine(offsetX + w, h, offsetX, h - pasoH);
        }

        // --- 3. Abajo Izquierda: Aproximación de parábola ---
        int offsetY = h; // Desplazamiento para el tercer cuadrante
        for (int i = 0; i <= lineas; i++) {
            int pasoW = i * (w / lineas);
            int pasoH = i * (h / lineas);

            // Va bajando por el eje Y y avanzando por el eje X
            g.drawLine(0, offsetY + pasoH, pasoW, offsetY + h);
        }

        // --- 4. Abajo Derecha: Superposición de parábolas ---
        offsetX = w;
        offsetY = h;

        // Dibuja cuatro parábolas superpuestas, una desde cada esquina del cuadrante
        for (int i = 0; i <= lineas; i++) {
            int pasoW = i * (w / lineas);
            int pasoH = i * (h / lineas);

            // Parábola esquina inferior izquierda
            g.drawLine(offsetX, offsetY + pasoH, offsetX + pasoW, offsetY + h);
            // Va subiendo por el eje Y y avanzando por el eje X

            // Parábola esquina superior izquierda
            g.drawLine(offsetX, offsetY + h - pasoH, offsetX + pasoW, offsetY);
            // Va bajando por el eje Y y avanzando por el eje X

            // Parábola esquina inferior derecha
            g.drawLine(offsetX + w, offsetY + pasoH, offsetX + w - pasoW, offsetY + h);
            // Va subiendo por el eje Y y retrocediendo por el eje X

            // Parábola esquina superior derecha
            g.drawLine(offsetX + w, offsetY + h - pasoH, offsetX + w - pasoW, offsetY);
            // Va bajando por el eje Y y retrocediendo por el eje X
        }
    }

}