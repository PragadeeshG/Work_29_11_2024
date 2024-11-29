package com.test1;

public class DataRenderness {
	private long documentObjectCode;
	private String modularData;
	private String dataReqion;
	private String documentObjectTeam;
	private String contact;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataRenderness() {

	}

	public DataRenderness(long documentObjectCode, String modularData, String dataReqion, String documentObjectTeam,
			String contact, String creationDate, String modifiedDate, String entityState) {
		super();
		this.documentObjectCode = documentObjectCode;
		this.modularData = modularData;
		this.dataReqion = dataReqion;
		this.documentObjectTeam = documentObjectTeam;
		this.contact = contact;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public long getDocumentObjectCode() {
		return documentObjectCode;
	}

	public void setDocumentObjectCode(long documentObjectCode) {
		this.documentObjectCode = documentObjectCode;
	}

	public String getModularData() {
		return modularData;
	}

	public void setModularData(String modularData) {
		this.modularData = modularData;
	}

	public String getDataReqion() {
		return dataReqion;
	}

	public void setDataReqion(String dataReqion) {
		this.dataReqion = dataReqion;
	}

	public String getDocumentObjectTeam() {
		return documentObjectTeam;
	}

	public void setDocumentObjectTeam(String documentObjectTeam) {
		this.documentObjectTeam = documentObjectTeam;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
