package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {
    private String id;  // 이 오브젝트의 아이디
    private String userId;  // 이 오브젝트를 생선한 사용자의 아이디
    private String title;   // Todo 타이틀(예: 운동하기)
    private boolean done;   // true - todo를 완료한 경우(checked)
}
