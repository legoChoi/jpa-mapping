package hellojpa;

import jakarta.persistence.*;

@Entity
public class Member {

    @Id @GeneratedValue()
    @Column(name = "member_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @ManyToOne
    @JoinColumn(name = "team_id")
    private Team team;
}
