package riwi.simulacro_SpringBoot.api.dto.requests;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 24
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AssignmentRequest {

    @NotBlank(message = "EL titulo del assignement es requerido")
    @Size(max = 100, message = "El titulo excede el limite de caracteres permitido")
    private String assinementTitle;

    @Column(columnDefinition = "TEXT",nullable = false)
    private String description;

    @FutureOrPresent(message = "La fecha y hora debe ser futura")
    @NotNull(message = "La fecha y hora de la cita es requeridas")
    private LocalDateTime dueDate;

    @NotNull(message = "Debes seleccionar una leccion")
    private Long lesson;

}
