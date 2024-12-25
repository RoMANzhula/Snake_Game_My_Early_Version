import javax.swing.*;

public class WindowGame extends JFrame { //створюємо клас WindowGame, який успадкований від батьківського класу JFrame (батьківський клас для вікон)
    public WindowGame() { //конструктор класу
        setTitle("SnakeGame"); //встановлюємо назву гри
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //встановлюємо дію для кнопки закриття вікна гри

        setSize(336, 359); //встановлюємо розмір вікна в пікселях
        setLocation(500, 200); //встановлюємо позицію вікна відносно екрана
        //setLocationRelativeTo(null); //можна встановити вікно по центру екрану
        add(new FieldGame()); //додаємо компонент класу FieldGame() до нашого ігрового вікна
        setVisible(true); //метод з параметром true відображає ігрове вікно на екрані ПК, false робить його невидимим
    }
}
