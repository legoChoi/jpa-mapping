package hellojpa;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Product {

    @Id @GeneratedValue
    @Column(name = "product_id")
    private Long id;

    private String name;

    /**
     * 양방향
     */
    @ManyToMany(mappedBy = "products")
    private List<Member> members = new ArrayList<>();
}
