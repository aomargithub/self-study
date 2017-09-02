package com.example.springdatacassandra.domain;



import java.util.Date;
import java.util.UUID;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.driver.core.utils.UUIDs;

@Table(value = "greetings")
public class Greeting {

    @PrimaryKeyColumn(name = "id",ordinal = 1,type = PrimaryKeyType.CLUSTERED)
    private UUID id = UUIDs.timeBased();

    @PrimaryKeyColumn(name="user",ordinal = 0,type = PrimaryKeyType.PARTITIONED)
    private String user;

    @Column(value = "greet")
    private String greet;

    @Column(value = "creation_date")
    private Date creationDate;

    public UUID getId() {

        return id;

    }

    public void setId(UUID id) {

        this.id = id;

    }

    public Date getCreationDate() {

        return creationDate;

    }

    public void setCreationDate(Date creationDate) {

        this.creationDate = creationDate;

    }

    public String getUser() {

        return user;

    }

    public void setUser(String user) {

        this.user = user;

    }

    public String getGreet() {

        return greet;

    }

    public void setGreet(String greet) {

        this.greet = greet;

    }

}