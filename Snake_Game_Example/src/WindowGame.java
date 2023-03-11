import javax.swing.*;

public class WindowGame extends JFrame { //создаем класс ОкноИгры унаследованный от класса-родителя JFrame (родитель
    //для классов, которые выступают в качестве ОКОН)
    public WindowGame() { //конструктор класса
        setTitle("SnakeGame"); //устанавливаем название игры
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //устанавливаем значек "закрытие игры"

        setSize(336, 359); //устанавливаем размер ОКНА в пикселях
        setLocation(500, 200); //спавнимся - устанавливаем место позиционирования игрового окна относительно монитора
        //setLocationRelativeTo(null); //можно спавнится по середине экрана
        add(new FieldGame()); //осуществляем привязку компонента класса FieldGame() к нашему игровому окну
        setVisible(true); //метод с флагом true - отображает наше игровое окно на экране ПК, флаг false - делает его
        //невидимым
    }
}