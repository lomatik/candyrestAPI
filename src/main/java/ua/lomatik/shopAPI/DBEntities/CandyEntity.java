package ua.lomatik.shopAPI.DBEntities;

import javax.persistence.*;

@Entity
public class CandyEntity {
    @Id
    @SequenceGenerator(name = "candy_sequence", sequenceName = "candy_sequence")
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "candy_sequence")
    private Long id;
    private String name;
    @Column(unique = true)
    private int barCode;

    public CandyEntity() {}

    public CandyEntity(String name, int barCode) {
        this.name = name;
        this.barCode = barCode;
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

    public int getBarCode() {
        return barCode;
    }

    public void setBarCode(int barCode) {
        this.barCode = barCode;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bar_code=" + barCode +
                '}';
    }
}
