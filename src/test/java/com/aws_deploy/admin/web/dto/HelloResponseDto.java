package com.aws_deploy.admin.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {
        //given
        private final String name;
        private final int amount;

}
