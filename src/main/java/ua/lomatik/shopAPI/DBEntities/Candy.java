package ua.lomatik.shopAPI.DBEntities;

import javax.persistence.*;

@Entity
public class Candy {
    @Id
    @SequenceGenerator(name = "candy_sequence", sequenceName = "candy_sequence")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "candy_sequence")
    private Long id;
    private String name;
    private int bar_code;

    public Candy() {}

    public Candy(String name, int bar_code) {
        this.name = name;
        this.bar_code = bar_code;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBar_code() {
        return bar_code;
    }

    public void setBar_code(int bar_code) {
        this.bar_code = bar_code;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bar_code=" + bar_code +
                '}';
    }
}
