package riwi.simulacro_SpringBoot.api.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//6
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseResponse {
    private String course_name;
    private String description;
    private UserResponse user;
}
