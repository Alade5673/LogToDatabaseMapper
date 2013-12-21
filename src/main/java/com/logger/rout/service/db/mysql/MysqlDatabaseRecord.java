package com.logger.rout.service.db.mysql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.logger.rout.service.db.DatabaseRecord;

@Entity
@Table(name = "activity", schema = "mylogs")
public class MysqlDatabaseRecord implements Serializable, DatabaseRecord {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5204942194717950587L;

	public MysqlDatabaseRecord() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	String serverOrClient;
	@Temporal(TemporalType.TIMESTAMP)
	Date timestampVal;
	String webContainerOrThreadName;
	String userID;
	String browserName;
	String browserVersion;
	String requestURL;
	String userAction;
	String currentTabForClientOnly;
	String editMode;
	String metricClass;
	String policyId;
	String policyNumber;
	String sessionId;
	String elapsedTimeServerOnly;
	String submitTime;
	String loadTime;
	String readyTime;
	String totalTime;

	public String getServerOrClient() {
		return serverOrClient;
	}

	public String getId() {
		return id;
	}

	public void setServerOrClient(String serverOrClient) {
		this.serverOrClient = serverOrClient;
	}

	public Date getTimestampVal() {
		return timestampVal;
	}

	public void setTimestampVal(Date timestampVal) {
		this.timestampVal = timestampVal;
	}

	public String getWebContainerOrThreadName() {
		return webContainerOrThreadName;
	}

	public void setWebContainerOrThreadName(String webContainerOrThreadName) {
		this.webContainerOrThreadName = webContainerOrThreadName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getBrowserName() {
		return browserName;
	}

	public void setBrowserName(String browserName) {
		this.browserName = browserName;
	}

	public String getBrowserVersion() {
		return browserVersion;
	}

	public void setBrowserVersion(String browserVersion) {
		this.browserVersion = browserVersion;
	}

	public String getRequestURL() {
		return requestURL;
	}

	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}

	public String getUserAction() {
		return userAction;
	}

	public void setUserAction(String userAction) {
		this.userAction = userAction;
	}

	public String getCurrentTabForClientOnly() {
		return currentTabForClientOnly;
	}

	public void setCurrentTabForClientOnly(String currentTabForClientOnly) {
		this.currentTabForClientOnly = currentTabForClientOnly;
	}

	public String getEditMode() {
		return editMode;
	}

	public void setEditMode(String editMode) {
		this.editMode = editMode;
	}

	public String getMetricClass() {
		return metricClass;
	}

	public void setMetricClass(String metricClass) {
		this.metricClass = metricClass;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public String getElapsedTimeServerOnly() {
		return elapsedTimeServerOnly;
	}

	public void setElapsedTimeServerOnly(String elapsedTimeServerOnly) {
		this.elapsedTimeServerOnly = elapsedTimeServerOnly;
	}

	public String getSubmitTime() {
		return submitTime;
	}

	public void setSubmitTime(String submitTime) {
		this.submitTime = submitTime;
	}

	public String getLoadTime() {
		return loadTime;
	}

	public void setLoadTime(String loadTime) {
		this.loadTime = loadTime;
	}

	public String getReadyTime() {
		return readyTime;
	}

	public void setReadyTime(String readyTime) {
		this.readyTime = readyTime;
	}

	public String getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}

	@Override
	public String toString() {
		return "CSVRecord [serverOrClient=" + serverOrClient + ", timestamp="
				+ timestampVal + ", webContainerOrThreadName="
				+ webContainerOrThreadName + ", userID=" + userID
				+ ", browserName=" + browserName + ", browserVersion="
				+ browserVersion + ", requestURL=" + requestURL
				+ ", userAction=" + userAction + ", currentTabForClientOnly="
				+ currentTabForClientOnly + ", editMode=" + editMode
				+ ", metricClass=" + metricClass + ", policyId=" + policyId
				+ ", policyNumber=" + policyNumber + ", sessionId=" + sessionId
				+ ", elapsedTimeServerOnly=" + elapsedTimeServerOnly
				+ ", submitTime=" + submitTime + ", loadTime=" + loadTime
				+ ", readyTime=" + readyTime + ", totalTime=" + totalTime + "]";
	}

}
