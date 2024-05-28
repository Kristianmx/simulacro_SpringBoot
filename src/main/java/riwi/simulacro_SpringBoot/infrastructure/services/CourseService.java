package riwi.simulacro_SpringBoot.infrastructure.services;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import riwi.simulacro_SpringBoot.api.dto.requests.CourseRequest;
import riwi.simulacro_SpringBoot.api.dto.responses.CourseResponse;
import riwi.simulacro_SpringBoot.infrastructure.abstrac_services.ICourseService;

@Service
@AllArgsConstructor
public class CourseService implements ICourseService{
    
    @Override
    public CourseResponse create(CourseRequest request) {
        return null;
    }

    @Override
    public CourseResponse get(Long id) {
        return null;
    }

    @Override
    public CourseResponse update(CourseRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public Page<CourseResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public Long FindById(Long id) {
        return null;
    }
    
}
