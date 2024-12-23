package hellojpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "members")
public class Member extends BaseEntity {

    @Id @GeneratedValue()
    @Column(name = "member_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    private Team team;

    /**
     * 주 테이블에 외래키를 둬야할지 대상 테이블에 둬야할지
     * 후에 배울 프록시 관련하여 공부하고 판단
     */
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "locker_id")
    private Locker locker;

    /**
     * @JoinTable() member, product의 키 값이 식별관계로된 매핑 테이블 만들어짐
     */
    @ManyToMany
    @JoinTable(name = "member_product")
    private List<Product> products = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
