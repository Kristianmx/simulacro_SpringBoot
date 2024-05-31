package riwi.simulacro_SpringBoot.domain.entities;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 23
@Entity(name = "assignment")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Assignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100,nullable = false)
    private String  assignmentTitle;
    @Column(columnDefinition = "TEXT",nullable = false)
    private String  description;
    @Column(nullable = false)
    private LocalDateTime dueDate;

    //23.1
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name ="lesson_id",referencedColumnName = "id")
    private Lesson lesson;
}
