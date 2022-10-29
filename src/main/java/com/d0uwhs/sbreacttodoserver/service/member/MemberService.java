package com.d0uwhs.sbreacttodoserver.service.member;

import com.d0uwhs.sbreacttodoserver.web.dto.request.member.MemberRequest;

public interface MemberService {

    void insertMember(MemberRequest memberRequest);
}
