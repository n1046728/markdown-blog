package com.swj.mdblog.entities;

import com.swj.mdblog.util.LocalDateTimeConverter;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "posts")
public class Post {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column
	private long id;

	@Column
	private String title;

	@Column(columnDefinition = "TEXT")
	private String content;

	@Column(length = 150)
	private String synopsis;

	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author;

	@Column
	@Convert(converter = LocalDateTimeConverter.class)
	private LocalDateTime dateTime;
}