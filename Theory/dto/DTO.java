package dto;

import java.util.*;

public class DTO{
	private String login;
	private String password;
	private Long timestamp;

	public DTO(){}
	public DTO(String login, String password, Long timestamp){
	this.login = login;
	this.password = password;
	this.timestamp = timestamp;
	}

	public String getLogin(){
	return this.login;
	}

	public void setLogin(String login){
	this.login = login;
	}

	public String getPassword(){
	return this.password;
	}

	public void setPassword(String password){
	this.password = password;
	}

	public Long getTimestamp(){
	return this.timestamp;
	}

	public void setTimestamp(Long timestamp){
	this.timestamp = timestamp;
	}


	@Override
	public String toString(){
	return "DTO : login = " + this.login + " , password = " + this.password + " , timestamp = " + timestamp + ".";
	}

	@Override
	public int hashCode(){
	return Objects.hash(login, password, timestamp);
	}

	@Override
	public boolean equals(Object object){
	if (object == this){ 
	return true;
	}
	if (object == null){
	return false;
	}
	if(this.getClass() != object.getClass()){
	return false;
	}
	DTO dto = (DTO) object;
	return Objects.equals(this.login, dto.login) && Objects.equals(this.password, dto.password) && Objects.equals(this.timestamp, dto.timestamp);
	}

}