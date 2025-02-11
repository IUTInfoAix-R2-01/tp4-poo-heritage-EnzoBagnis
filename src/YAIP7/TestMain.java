package YAIP7;

import java.util.Date;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Alice");
        customer1.setMember(true);
        customer1.setMemberType("Premium");

        Visit visit1 = new Visit(customer1.getName(), new Date());
        visit1.setServiceExpense(100);
        visit1.setProductExpense(50);

        System.out.println(visit1); // Affiche les détails de la visite et le total après réduction
    }
}

