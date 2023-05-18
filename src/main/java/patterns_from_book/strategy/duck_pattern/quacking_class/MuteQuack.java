package patterns_from_book.strategy.duck_pattern.quacking_class;


import patterns_from_book.strategy.duck_pattern.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
