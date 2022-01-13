package com.example.demo;

import lombok.Builder;
import lombok.NonNull;
import lombok.RequireArgsConstructor;

@Builder
@RequiredArgsConstructor

public class DemoModel {

    @NonNull
    private String id;
}
