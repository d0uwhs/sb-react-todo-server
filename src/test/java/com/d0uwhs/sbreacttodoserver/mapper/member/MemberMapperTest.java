package com.d0uwhs.sbreacttodoserver.mapper.member;

import com.d0uwhs.sbreacttodoserver.web.dto.request.member.MemberRequest;
import com.d0uwhs.sbreacttodoserver.web.dto.response.member.MemberResponse;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Slf4j
@SpringBootTest
class MemberMapperTest {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void insertMember() {
        String username = "test";
        MemberRequest memberRequest = MemberRequest.builder().username(username).password(passwordEncoder.encode("123456")).build();
        Long result = memberMapper.insertMember(memberRequest);
        assertThat(result).isNotNull();
    }

    @Test
    void findByUsername() {
        String username = "123";
        MemberResponse memberResponse = memberMapper.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("Not Found ID : " + username));
        log.info(memberResponse.getUsername());
    }
}
