package com.d0uwhs.sbreacttodoserver.service.testtime;

import com.d0uwhs.sbreacttodoserver.mapper.TestTimeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultTestTimeService implements TestTimeService {

    private final TestTimeMapper testTimeMapper;

    @Override
    public String getTime() {
        return testTimeMapper.getTime();
    }
}
