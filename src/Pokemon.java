import java.util.Arrays;
import java.util.List;

public abstract class Pokemon implements PokemonGym {
//    Instance variabelen
    private String type;
    private String name;
    List<String> attacks;

//    Constructor
    public Pokemon(String type, String name, List<String> attacks) {
        this.type = type;
        this.name = name;
        this.attacks = attacks;
    }

//    Getters en Setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }

//    Instance method


}
