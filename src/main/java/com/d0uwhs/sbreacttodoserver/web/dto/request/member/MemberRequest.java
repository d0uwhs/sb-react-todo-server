package com.d0uwhs.sbreacttodoserver.web.dto.request.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class MemberRequest {
    private String username;
    private String password;
}
