package com.email_Generator.beans;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component	
public class Email {	
	private String name;
	private String email;
	private Date appointment_date;
	private String interview_transcription;
	private boolean move_forward;
	public Email(String name, String email, Date appointment_date, String interview_transcription,
			boolean move_forward) {
		super();
		this.name = name;
		this.email = email;
		this.appointment_date = appointment_date;
		this.interview_transcription = interview_transcription;
		this.move_forward = move_forward;
	}
	
	public Email() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getAppointment_date() {
		return appointment_date;
	}

	public void setAppointment_date(Date appointment_date) {
		this.appointment_date = appointment_date;
	}

	public String getInterview_transcription() {
		return interview_transcription;
	}

	public void setInterview_transcription(String interview_transcription) {
		this.interview_transcription = interview_transcription;
	}

	public boolean isMove_forward() {
		return move_forward;
	}

	public void setMove_forward(boolean move_forward) {
		this.move_forward = move_forward;
	}
	
}
