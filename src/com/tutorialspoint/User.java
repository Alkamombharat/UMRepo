/**
 * 
 */
package com.tutorialspoint;

/**
 * @author jievan
 *
 */
import java.io.Serializable;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "user")
public class User<Object> implements Serializable {

	private static final long serialVersionUID = 1L;
	private int userid;
	private String name;
	private String profession;

	public User() {
	}

	public User(int id, String name, String profession) {

		this.userid = id;
		this.name = name;
		this.profession = profession;
	}

	public int getId() {
		return userid;
	}

	@XmlElement
	public void setId(int id) {
		this.userid = id;
	}

	public String getName() {
		return name;
	}

	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getProfession() {
		return profession;
	}

	@XmlElement
	public void setProfession(String profession) {
		this.profession = profession;
	}

//	@Override
//	public boolean equals(Object object) {
//		if (object == null) {
//			return false;
//		} else if (!(object instanceof User)) {
//			return false;
//		} else {
//			User user = (User) object;
//			if (userid == user.getId() && name.equals(user.getName())
//					&& profession.equals(user.getProfession())) {
//				return true;
//			}
//		}
//		return false;
//	}
}