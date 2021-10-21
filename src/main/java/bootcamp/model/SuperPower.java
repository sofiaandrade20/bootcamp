package bootcamp.model;

import lombok.*;
import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "superPower")
public class SuperPower {
    //Id creation
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //Class attributes
    private String name;
    private String type;
    private Long scale;
    //Relation with hero table
    @ManyToMany
    @JoinTable(
            name = "hero_superpower",
            joinColumns = @JoinColumn(name = "id_superpower", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_hero", referencedColumnName = "id")
    )
    private Set<Hero> heroes;
}
