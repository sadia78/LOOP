package com.tjt.URLCreation.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Url {
	@Id
	private String urlPattern;
	private String link;
	public String getUrlPattern() {
		return urlPattern;
	}
	public void setUrlPattern(String urlPattern) {
		this.urlPattern = urlPattern;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	

}
