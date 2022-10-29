package com.d0uwhs.sbreacttodoserver.mapper.member;

import com.d0uwhs.sbreacttodoserver.web.dto.request.member.MemberRequest;
import com.d0uwhs.sbreacttodoserver.web.dto.response.member.MemberResponse;
import org.apache.ibatis.annotations.Mapper;

import java.util.Optional;

@Mapper
public interface MemberMapper {

    Optional<MemberResponse> findByUsername(String username);

    Long insertMember(MemberRequest memberRequest);
}
