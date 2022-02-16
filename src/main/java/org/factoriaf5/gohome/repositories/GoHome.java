package org.factoriaf5.gohome.repositories;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "homes")
public class GoHome implements Serializable {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String image;
        private int price;
        private float surface;
        private String description;
        private int bedrooms;
        private String location;


}
