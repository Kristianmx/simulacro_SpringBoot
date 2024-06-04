package riwi.simulacro_SpringBoot.api.controllers;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import riwi.simulacro_SpringBoot.api.dto.requests.SubmissionRequest;
import riwi.simulacro_SpringBoot.api.dto.responses.SubmissionResponse;

import java.util.Map;

@RestController
@RequestMapping("/api/submissions")
public class ddda implements ControllerGeneric<SubmissionRequest, SubmissionResponse, Long> {


    @Override
    public ResponseEntity<Page<SubmissionResponse>> getAll(int page, int size) {
        return null;
    }

    @Override
    public ResponseEntity<SubmissionResponse> get(Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<SubmissionResponse> insert(SubmissionRequest request) {
        return null;
    }

    @Override
    public ResponseEntity<SubmissionResponse> update(SubmissionRequest request, Long aLong) {
        return null;
    }

    @Override
    public ResponseEntity<Map<String, String>> delete(Long aLong) {
        return null;
    }
}
