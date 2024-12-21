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

    /**
     * 주 테이블에 외래키를 둬야할지 대상 테이블에 둬야할지
     * 후에 배울 프록시 관련하여 공부하고 판단
     */
    @OneToOne
    @JoinColumn(name = "locker_id")
    private Locker locker;
}
