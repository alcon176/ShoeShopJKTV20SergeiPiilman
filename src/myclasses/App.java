
package myclasses;

import Interface.Keeping;
import Keeper.FileKeeper;
import entity.Shoe;
import entity.Custumer;
import entity.History;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class App {
    Scanner scanner = new Scanner(System.in);
    List<Shoe> shoes = new ArrayList<>();
    List<Custumer> custumers = new ArrayList<>();
    List<History> histories = new ArrayList();
    Keeping keeper = new FileKeeper();
    public void run(){
        String repeat = "y";
        do{
            System.out.println("Выберите задачу: ");
            System.out.println("0: Выход из программы");
            System.out.println("1: Добавить модель");
            System.out.println("2: Список продоваемых моделей");
            System.out.println("3: Добавить покупателя");
            System.out.println("4: Список зарегистрированных покупателей");
            System.out.println("5: Покупка покупателем обуви");
            System.out.println("6: Доход магазина за все время работы");
            System.out.println("7: Добавить денег покупателю");
            int task = scanner.nextInt();
            scanner.nextLine();
            
            
            scanner.nextLine();
            switch (task) {
                case 0: 
                    repeat="q";
                    System.out.println("Программа закончена");
                    break;
                case 1: 
                    System.out.println("Добавить модель: ");

                            shoes.add(addShoe());
                            keeper.saveShoes(shoes);
                            break;
 
                case 2: 
                    System.out.println("Список продаваемых моделей: ");
                    for (int i = 0; i < shoes.size(); i++) {
                        if(shoes.get(i) != null){
                            System.out.println(shoes.get(i).toString());
                        }
                    }
                    break;
                case 3: 
                    System.out.println("Добавить покупателя: ");

                            custumers.add(addCustumer());
                            keeper.saveCustumers(custumers);
                            break;

                case 4: 
                    System.out.println("Список зарегистрированных покупателей: ");
                    for (int i = 0; i < custumers.size(); i++) {
                        if(custumers.get(i) != null){
                            System.out.println(custumers.get(i).toString());
                        }
                    }
                    break;
                    
                case 5: 
                    System.out.println("Покупка покупателем обуви: ");

                            histories.add(addHistory());
                            keeper.saveHistories(histories);
                    break;
                case 6: 
                    System.out.println("Доход магазина за все время работы: ");
                    break;
                case 7: 
                    System.out.print("Добавить денег покупателю: ");
                    break;
            }
 
        }while("y".equals(repeat));
    }

private Shoe addShoe(){
        Shoe shoe = new Shoe();
        System.out.print("Введите фирму: ");
        shoe.setFirma(scanner.nextLine());
        System.out.print("Введите модель: ");
        shoe.setModel(scanner.nextLine());
        System.out.print("Введите размер модели: ");
        shoe.setSize(scanner.nextInt());
        System.out.println("Введите цену");
        shoe.setPrice(scanner.nextInt());
        return shoe;
    }
private Custumer addCustumer(){
        Custumer custumer = new Custumer();
        System.out.print("Введите Имя: ");
        custumer.setFirstname(scanner.nextLine());
        System.out.print("Введите Фамилию: ");
        custumer.setLastname(scanner.nextLine());
        System.out.print("Введите номер телефона: ");
        custumer.setPhone(scanner.nextLine());
        System.out.println("Введите баланс:");
        custumer.setBalance(scanner.nextInt());
        return custumer;
    }
    private History addHistory(){
        History history = new History();

        System.out.println("Список моделей:");
        for (int i = 0; i < shoes.size(); i++) {
                        if(shoes.get(i) != null){
                            System.out.printf("%d. %s%n",i+1,shoes.get(i).toString());
                        }
        }
        System.out.println("Введите номер модели:");
        int shoeNumber = scanner.nextInt(); scanner.nextLine();
        history.setShoe(shoes.get(shoeNumber-1));
        System.out.println("");
        System.out.println("Список покупателей:");
        for (int i = 0; i < custumers.size(); i++) {
                        if(custumers.get(i) != null){
                            System.out.printf("%d. %s%n",i+1,custumers.get(i).toString());
                        }
        }
        System.out.println("Введите номер покупателя:");
        int custumerNumber = scanner.nextInt(); scanner.nextLine();
        history.setCustumer(custumers.get(shoeNumber-1));
        return history;
    }
}
