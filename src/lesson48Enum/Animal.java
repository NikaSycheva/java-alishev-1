package lesson48Enum;

public enum Animal {
    DOG("собака"),
    CAT("кошка"),
    FROG("жаба");

    private String translation;

    Animal(String translation){
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString(){
        return translation;
    }
}
