package com.codingrecipe.member.entity;

import com.fasterxml.jackson.annotation.JsonTypeId;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.message.AsynchronouslyFormattable;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Setter
@Getter
@Table(name="member_table")
public class MemberEntity {
}
