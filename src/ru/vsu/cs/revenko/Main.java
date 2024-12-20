package ru.vsu.cs.revenko;

import ru.vsu.cs.revenko.classes.Faculty;
import ru.vsu.cs.revenko.classes.Institute;
import ru.vsu.cs.revenko.classes.ResearchAssociate;


public class Main {

    public static void main(String[] args) {
        Faculty fkn = new Faculty("ФКН");
        Institute toizi = new Institute("ТОиЗИ", "297");
        Institute is = new Institute("ИС", "387");
        Institute tst = new Institute("ЦТ", "311п");
        Institute itu = new Institute("ИТУ", "312п");
        Institute piit = new Institute("ПиИТ", "380");
        fkn.setInstitutes(new Institute[]{toizi, is, tst, itu, piit});
        ResearchAssociate emp1 = new ResearchAssociate(1234, "Громковский Андрей Анатольевич",
                "Моделирование бизнес-процессов");
        ResearchAssociate emp2 = new ResearchAssociate(1234, "Бебнева Светлана Владимирована",
                "Основы компьютерной бухгалтерии");
        itu.setEmployees(new ResearchAssociate[]{emp1, emp2});
        Institute[] fkn_institutes = fkn.getInstitutes();
        System.out.println("Кафедры на факультете " + fkn.getName() + ": \n");
        for (int i = 0; i < fkn_institutes.length; i++) {
            System.out.println(fkn_institutes[i].getName());
        }
        System.out.println("\n");
        ResearchAssociate[] itu_employees = itu.getEmployees();
        System.out.println("Сотрудники кафедры " + itu.getName() + ": \n");
        for (int i = 0; i < itu_employees.length; i++) {
            System.out.println(itu_employees[i].getName());
        }
    }
}
