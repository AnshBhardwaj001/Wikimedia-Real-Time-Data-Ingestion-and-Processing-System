package com.project.springboot.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "wikimedia_recentchange")
@Getter
@Setter   //Lombok will automatically create the getter and setter methods for both : id and data.
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column(name = "wiki_event_data", columnDefinition = "TEXT")         // Since event data is quite large we use @Lob annotation
    private String wikiEventData;
}
