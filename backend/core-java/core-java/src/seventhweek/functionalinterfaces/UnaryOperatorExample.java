package seventhweek.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s)->s.concat("Default");



    public static void main(String[] args) {

        System.out.println(unaryOperator.apply("java8"));


    }
}
