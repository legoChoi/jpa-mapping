package hellojpa;

import jakarta.persistence.*;

@Entity
public class Locker {

    @Id @GeneratedValue
    @Column(name = "locker_id")
    private Long id;

    private String name;

    @OneToOne(mappedBy = "locker", fetch = FetchType.LAZY) // 양방향
    private Member member;
}
