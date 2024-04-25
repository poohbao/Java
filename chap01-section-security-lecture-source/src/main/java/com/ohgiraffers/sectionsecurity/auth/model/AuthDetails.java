package com.ohgiraffers.sectionsecurity.auth.model;

import com.ohgiraffers.sectionsecurity.user.dto.LoginUserDTO;
import com.ohgiraffers.sectionsecurity.user.model.dto.dao.UserMapper;
import org.springframework.security.core.userdetails.UserDetails;

public class AuthDetails implements UserDetails {

    private LoginUserDTO loginUserDTO;
    public AuthDetails() {}
    public AuthDetails(LoginUserDTO loginUserDTO) {
        loginUserDTO = loginUserDTO;
    }
    /* 필기.
    *  권한 정보를 반환하는 메소드
    *  UsernamePasswordAuthenticationToken 에 사용자의 권한 정보를 넣을 때 사용한다.
    *  다중 권한 처리 가능하다.  */

}
    /* 필기.
    *   사용자의 비밀번호를 반환하는 메소드
    *   UsernamePasswordAuthenticationToken 과 사용자의 비밀번호를 비교할 때 사용한다.
    * */

    /* 필기.
    *   사용자의 아이디를 반환하는 메소드이다.
    *   UsernamePasswordAuthenticationToken 과 사용자의 아이디를 비교할 때 사용한다. */

    @Override
    public Boolean isAccountNonExpired() {
        return false;
    }

    /* 필기.
    *   잠겨있는 계정을 확인하는 메소드 false 이면 해당 계정을 사용할 수 없다.
    *   비밀번호 반복 실패로 일시적인 계정 lock 인 경우 혹은 오랜 시간
    *   비 접속으로 휴먼 처리
    * */

    /* 필기.
    *   탈퇴 계정 여부를 표현하는 메소드 false 이면 해당 계정을 사용할 수 없다.
    * */
    @Override
    public boolean isCredentialNonExpired() {
        return false;
    }

    /* 필기.
    *   계정 비활성화 여부로 사용자가 사용할 수 없는 상태
    *   false 이면 계정을 사용할 수 없다. 삭제 처리 같은 경우
    * */
    @Override


