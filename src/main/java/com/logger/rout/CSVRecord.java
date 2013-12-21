package com.logger.rout;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@CsvRecord(separator = ",")
public class CSVRecord {
	@DataField(pos = 1)
	String serverOrClient;
	@DataField(pos = 2)
	String timestamp;
	@DataField(pos = 3)
	String webContainerOrThreadName;
	@DataField(pos = 4)
	String userID;
	@DataField(pos = 5)
	String browserName;
	@DataField(pos = 6)
	String browserVersion;
	@DataField(pos = 7)
	String requestURL;
	@DataField(pos = 8)
	String userAction;
	@DataField(pos = 9)
	String currentTabForClientOnly;
	@DataField(pos = 10)
	String editMode;
	@DataField(pos = 11)
	String metricClass;
	@DataField(pos = 12)
	String policyId;
	@DataField(pos = 13)
	String policyNumber;
	@DataField(pos = 14)
	String sessionId;
	@DataField(pos = 15)
	String elapsedTimeServerOnly;
	@DataField(pos = 16)
	String submitTime; // as measured by browser, Client only
	@DataField(pos = 17)
	String loadTime; // (time that browser loads, Client only)
	@DataField(pos = 18)
	String readyTime; // (time it took for doc.ready to run, Client only)
	@DataField(pos = 19)
	String totalTime; // if available – this is the real time the user had to
						// wait from the initial click of tab or button until
						// the next page was ready for use

	public String getServerOrClient() {
		return serverOrClient;
	}

	public void setServerOrClient(String serverOrClient) {
		this.serverOrClient = serverOrClient;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
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
				+ timestamp + ", webContainerOrThreadName="
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
