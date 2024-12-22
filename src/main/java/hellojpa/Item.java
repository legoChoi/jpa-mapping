package hellojpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "items")
// (Album, Book, Movie)
// 슈퍼-서브 타입의 구현: 전략 지정 필요
// JOINED: 조인 전략: 기본임
// SINGLE_TABLE: 단일 테이블 전략, 한 테이블에 서브들의 컬럼들을 다 넣고 안채워진 서브의 컬럼들은 null이 들어감
// 구현 클래스마다 테이블 전략 DBA와 ORM 전문가 둘 다 추천 X
// 슈퍼 테이블를 없애버리고 슈퍼 테이블의 ID 값을 서브 테이블들의 ID 값으로 지정
@Inheritance(strategy = InheritanceType.JOINED)
// 슈퍼 테이블에 Dtype 컬럼 추가 어떤 서브(엔티티 명)인지 저장
// @DiscriminatorValue(value = "")로 서브 별칭 지정 가능
// 단일 테이블 전략에선 생략해도 무조건 생김
@DiscriminatorColumn
public class Item {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();

    private String name;
    private int price;
    private int stockQuantity;
}
