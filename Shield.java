
public abstract class Shield implements Defense {
    public abstract String KindOfShield();

    @Override
    public String toString() {
        return String.format("Уровень защиты: %d Тип щита: %s ",protection(),KindOfShield());
    }
}