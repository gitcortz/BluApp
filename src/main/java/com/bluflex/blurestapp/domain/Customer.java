package com.bluflex.blurestapp.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collection;

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    /*@ManyToOne
    private Customer parent;
    @OneToMany(mappedBy="parent")
    private Collection<Customer> branches;
    */
}
