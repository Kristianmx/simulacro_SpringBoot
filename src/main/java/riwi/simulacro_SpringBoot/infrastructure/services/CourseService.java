package riwi.simulacro_SpringBoot.infrastructure.services;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import riwi.simulacro_SpringBoot.api.dto.requests.CourseRequest;
import riwi.simulacro_SpringBoot.api.dto.responses.CourseResponse;
import riwi.simulacro_SpringBoot.domain.entities.Courses;
import riwi.simulacro_SpringBoot.domain.repositories.CoursesRepository;
import riwi.simulacro_SpringBoot.infrastructure.abstrac_services.ICourseService;
import riwi.simulacro_SpringBoot.util.exceptions.IdNotFoundException;

// 8
@Service
@AllArgsConstructor
public class CourseService implements ICourseService{

    @Autowired final CoursesRepository coursesRepository;
    
    // 12
    @Override
    public CourseResponse create(CourseRequest request) {
        Courses courses = this.requesToCourses(request, new Courses());
        return this.entityResponse(this.coursesRepository.save(courses));
    }

    // 14
    @Override
    public CourseResponse get(Long id) {
        return this.entityResponse(this.find(id));
    }

    @Override
    public CourseResponse update(CourseRequest request, Long id) {
        return null;
    }

    // 13
    @Override
    public void delete(Long id) {
        Courses courses = this.find(id);
        this.coursesRepository.delete(courses);
    }

    // 15 
    @Override
    public Page<CourseResponse> getAll(int page, int size) {
        if(page < 0){
            page = 0;
        }
        PageRequest pagination = PageRequest.of(page, size);

        return this.coursesRepository.findAll(pagination).map(this::entityResponse);
    }

    @Override
    public Long FindById(Long id) {
        return null;
    }

    // 9
    private Courses find(Long id){
        return this.coursesRepository.findById(id).orElseThrow(() -> new IdNotFoundException("Curso"));
    }

    //10 
    private CourseResponse entityResponse(Courses entity){
        CourseResponse response = new CourseResponse();
        BeanUtils.copyProperties(entity, response);
        return response;
    }

    // 11
    private Courses requesToCourses(CourseRequest request, Courses courses){
        BeanUtils.copyProperties(request, courses);
        return courses;
    }
    
}
