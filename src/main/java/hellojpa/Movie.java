package hellojpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie extends Item{

    private String director;
    private String actor;
}
