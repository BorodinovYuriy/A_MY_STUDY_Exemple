package patterns_from_book.decorator;

public class HouseBlend extends  Beverage{

    public HouseBlend(){
        //Конструктор знает о переменной description из родителя
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}