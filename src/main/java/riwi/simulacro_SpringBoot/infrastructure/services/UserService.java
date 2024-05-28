package riwi.simulacro_SpringBoot.infrastructure.services;

import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import riwi.simulacro_SpringBoot.api.dto.requests.UserRequest;
import riwi.simulacro_SpringBoot.api.dto.responses.UserResponse;
import riwi.simulacro_SpringBoot.infrastructure.abstrac_services.IUserService;
@Service
@AllArgsConstructor
public class UserService implements IUserService {
    @Override
    public UserResponse create(UserRequest request) {
        return null;
    }

    @Override
    public UserResponse get(Long aLong) {
        return null;
    }

    @Override
    public UserResponse update(UserRequest request, Long aLong) {
        return null;
    }

    @Override
    public void delete(Long aLong) {

    }

    @Override
    public Page<UserResponse> getAll(int page, int size) {
        return null;
    }

    @Override
    public Long FindById(Long id) {
        return null;
    }
}
