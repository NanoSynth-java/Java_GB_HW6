import java.util.*;

public class NoteBook {

    String CPU;
    String video;
    String HDD;
    String RAM;
    String OS;
    String PSU;

    public NoteBook(String CPU, String video, String HDD, String RAM, String PSU, String OS) {
        this.CPU = CPU;
        this.video = video;
        this.HDD = HDD;
        this.RAM = RAM;
        this.OS = OS;
        this.PSU = PSU;
    }

    public static Set<NoteBook> ShowAllPC(Set<NoteBook> n) {
        return n;
    }

    public static void main(String[] args) {
        /*
        1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
        2. Создать множество ноутбуков.
        3. Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
        */

        boolean start = true;

        ArrayList<NoteBook> NoteBookArray = new ArrayList<>();
        NoteBookArray.add(new NoteBook("Intel","NVidia","10 TB","64 Gb","1600W","Win 11"));
        NoteBookArray.add(new NoteBook("Intel","AMD","4 TB","16 Gb","850W","Win 10"));
        NoteBookArray.add(new NoteBook("AMD","AMD","8 TB","32 Gb","1500W","Win 11"));
        NoteBookArray.add(new NoteBook("AMD","NVidia","6 TB","32 Gb","1200W","Win 11"));
        NoteBookArray.add(new NoteBook("Intel","Intel","2 TB","16 Gb","1000W","Win 10"));
        System.out.println(NoteBookArray);

        Set<NoteBook> noteBooksSet = new HashSet<>(NoteBookArray);
        System.out.println(ShowAllPC(noteBooksSet));



//        System.out.println("Приветствуем вас в нашем Интернет магазине Мега Комп");
//        System.out.println("Нажмите Enter что бы продолжить и найти компьютер вашей мечты!");
//        Scanner scanner = new Scanner(System.in);
//        while (start) {
//            String RAM = scanner.nextLine();
//            System.out.println("Укажите размер ОЗУ (16 / 32 / 64)");
//            String HDD = scanner.nextLine();
//            System.out.println("Насколько вместительным будет HDD? (2 / 4 / 8 / 10)");
//            String CPU = scanner.nextLine();
//            System.out.println("Какой процессор вам хотелось бы? (Intel или AMD)");
//            String video = scanner.nextLine();
//            System.out.println("Выберите желаемую видео карту (Nvidia или AMD)");
//            String PSU = scanner.nextLine();
//            System.out.println("Мощность PSU (850/1000/1200/1500/1600)");
//
//            for (NoteBook findNotebook : noteBooksSet) {
//                if (findNotebook.RAM.equals(RAM)) {
//                    System.out.println(findNotebook);
//                    start = false;
//                }
//            }
//        }
    }
}