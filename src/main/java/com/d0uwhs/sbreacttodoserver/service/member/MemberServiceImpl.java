package com.d0uwhs.sbreacttodoserver.service.member;

import com.d0uwhs.sbreacttodoserver.mapper.member.MemberMapper;
import com.d0uwhs.sbreacttodoserver.web.dto.request.member.MemberRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements UserDetailsService, MemberService {

    private final PasswordEncoder passwordEncoder;
    private final MemberMapper memberMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return memberMapper.findByUsername(username)
                        .orElseThrow(() -> new UsernameNotFoundException("NOT FOUND USER" + username));
    }

    @Override
    public void insertMember(MemberRequest memberRequest) {

    }
}
