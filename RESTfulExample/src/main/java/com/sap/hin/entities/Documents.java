package com.sap.hin.entities;

import javax.persistence.Column;

public class Documents {
	
	@Column(name="\"DocumentID\"")
	String documentId;
	
	@Column(name="\"ContributionID\"")
	String contributionId;
	
	@Column(name="\"MimeType\"")
	String mimeType;
	
	@Column(name="\"Name\"")
	String name;
	
	@Column(name="\"Description\"")
	String description;
}
