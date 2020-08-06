package com.naresh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="MEMBER")
public class Member {
	private String memberName;
	private String memebrAddress;
	@Id
	@GeneratedValue
	private int  memberNo;
	private String typeMemeber;
}
