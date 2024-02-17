package com.TejaITB3.Springboot.Globalexception;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@JsonAutoDetect(getterVisibility=Visibility.ANY)

public class Errordetails {

	Date timestamp;
	String msg;
	String exceptionmsg;
}
