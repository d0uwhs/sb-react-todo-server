package com.d0uwhs.sbreacttodoserver.controller.testtime;


import com.d0uwhs.sbreacttodoserver.web.dto.response.TestTimeDTO;
import lombok.RequiredArgsConstructor;

import com.d0uwhs.sbreacttodoserver.service.testtime.TestTimeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/testtime")
public class TestTimeController {

    private final TestTimeService testTimeService;

    @GetMapping
    public ResponseEntity<TestTimeDTO> getTIme(){
        TestTimeDTO testTimeDTO = TestTimeDTO.builder()
                .time(testTimeService.getTime())
                .build();
        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(testTimeDTO);
    }

}
