public class head extends teacher {
    public String rank = "";

    @Override
    void meow (){
        System.out.println("Я " + rank + ". Меня зовут " + name + ". Мне " + age+ " лет." + " Я преподаю " + lesson);
    }


}
