package com.linhtch90.psnbackend.entity;

import java.time.Instant;
import java.time.LocalDateTime;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@NoArgsConstructor自动生成不带参数的构造方法；
//@RequiredArgsConstructor自动生成带参数的构造方法，主要针对一些需要特殊处理的属性，比如未初始化的final属性；
//@AllArgsConstructor自动生成包含所有属性的构造方法。
//@Data
//使用位置：类
//将 @ToString, @EqualsAndHashCode, 所有字段的 Getter, 所有非 final 字段的 @Setter 以及 @RequiredArgsConstructor
//它通常用来生成简单的 POJO 和 Bean
//href: lombok 详解 https://blog.csdn.net/zzhongcy/article/details/122948536
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "comment")//一个mongodb重的collection
public class CommentEntity {
    @Id// 主键
    private String id;

    private String userId;

    private String userFullname;

    private String content;

    private Instant createdAt;
}
