package com.test1;

public class Renderness {
	private long documentObjectCode;
	private String documentObjectName;
	private String documentObjectDesc;
	private String remarks;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public Renderness() {

	}

	public Renderness(long documentObjectCode, String documentObjectName, String documentObjectDesc, String remarks,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.documentObjectCode = documentObjectCode;
		this.documentObjectName = documentObjectName;
		this.documentObjectDesc = documentObjectDesc;
		this.remarks = remarks;
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

	public String getDocumentObjectName() {
		return documentObjectName;
	}

	public void setDocumentObjectName(String documentObjectName) {
		this.documentObjectName = documentObjectName;
	}

	public String getDocumentObjectDesc() {
		return documentObjectDesc;
	}

	public void setDocumentObjectDesc(String documentObjectDesc) {
		this.documentObjectDesc = documentObjectDesc;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
