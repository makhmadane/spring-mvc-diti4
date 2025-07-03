package sn.springmvcditi4.entity;

import jakarta.persistence.*;
import lombok.*;



@Entity
/*@Getter
@Setter
@ToString
@RequiredArgsConstructor*/
@Builder
@RequiredArgsConstructor
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;

    @Column
    @NonNull
    private String nom;
    @Column
    @NonNull
    private String prenom;
    @Column
    @NonNull
    private int age;
    @Column
    @NonNull
    private String classe;


}
